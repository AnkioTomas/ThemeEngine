package net.ankio.materialthemebuilder;

import net.ankio.materialthemebuilder.generator.ColorStateListGenerator;
import net.ankio.materialthemebuilder.generator.ValuesAllGenerator;
import net.ankio.materialthemebuilder.generator.ValuesV31Generator;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;


public class GenerateResTask extends DefaultTask {

    private final File dir;
    private final ValuesAllGenerator valuesLightGenerator;
    private final ValuesAllGenerator valuesDarkGenerator;


    private final ValuesV31Generator valuesV31LightGenerator;
    private final ValuesV31Generator valuesV31DarkGenerator;
    private final List<ColorStateListGenerator> colorStateListGenerators = new ArrayList<>();

    @Inject
    public GenerateResTask(MaterialThemeBuilderExtension extension, File dir) {
        this.dir = dir;

        if (extension.isGenerateTextColors()) {
            for (String textColor : MaterialTheme.TEXT_COLORS) {
                for (String emphasis : MaterialTheme.TEXT_COLOR_EMPHASIS) {
                    String filename = "color/"
                            + MaterialTheme.getColorStateListFilename(textColor, emphasis)
                            + ".xml";
                    colorStateListGenerators.add(
                            new ColorStateListGenerator(new File(dir, filename), "?" + textColor, emphasis));
                }
            }
        }

        valuesLightGenerator = new ValuesAllGenerator(new File(dir, "values/values.xml"), extension,0);
        valuesDarkGenerator = new ValuesAllGenerator(new File(dir, "values-night/values.xml"), extension,1);

        valuesV31LightGenerator = new ValuesV31Generator(new File(dir, "values-v31/values.xml"), extension,0);
        valuesV31DarkGenerator = new ValuesV31Generator(new File(dir, "values-night-v31/values.xml"), extension,1);

    }

    @TaskAction
    public void generate() throws IOException {
        Util.clearDir(dir);
        for (ColorStateListGenerator colorStateListGenerator : colorStateListGenerators) {
            colorStateListGenerator.generate();
        }
        valuesLightGenerator.generate();
        valuesDarkGenerator.generate();
        valuesV31LightGenerator.generate();
        valuesV31DarkGenerator.generate();
    }


}

