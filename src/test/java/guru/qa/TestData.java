package guru.qa;

public class TestData {

    public  String firstName = "Ivan";
    public  String lastName = "Ivanov";
    public  String email = "test@test.com";
    public  String phone = "9998000001";
    public  String subject = "Biology";
    public  String currentAddress = "New-York, 13 Avenue, 2";

    public String jUnitText = "@ExtendWith({SoftAssertsExtension.class})\n"
            + "class Tests {\n"
            + "  @Test\n"
            + "  void test() {\n"
            + "    Configuration.assertionMode = SOFT;\n"
            + "    open(\"page.html\");\n"
            + "\n"
            + "    $(\"#first\").should(visible).click();\n"
            + "    $(\"#second\").should(visible).click();\n"
            + "  }\n"
            + "}";

}
