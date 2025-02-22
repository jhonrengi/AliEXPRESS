package com.es.aliexpress.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/AgregarProductoCarroCompras.feature",
        glue = "com.es.aliexpress.stepsDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AgregarProductoCarroComprasRunner {
}
