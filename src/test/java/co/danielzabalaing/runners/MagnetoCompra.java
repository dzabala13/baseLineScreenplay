package co.danielzabalaing.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(


        features = "src/test/resources/features/magneto_compra.feature",
        glue = "co.danielzabalaing.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class MagnetoCompra {
}
