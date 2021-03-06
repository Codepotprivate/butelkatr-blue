package pl.codepot.butelkatr.bottling
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc
import pl.codepot.butelkatr.bottling.controller.BottleController
import spock.lang.Specification

abstract class BaseMockMvcSpec extends Specification {

    def setup() {
        setupMocks()
        RestAssuredMockMvc.standaloneSetup(new BottleController())
    }

    void setupMocks() {
    }

}
