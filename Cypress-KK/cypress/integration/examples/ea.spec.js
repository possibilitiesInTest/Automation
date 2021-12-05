/// <reference types="cypress" />

describe("Testing of EA App", () => {
  before("login to application", () => {
    cy.visit("http://www.executeautomation.com/site");
    cy.fixture("eauser").as("user");
  });

  it("Testing of EA App", () => {
    //implicit wait
    cy.get("jump ti slide 2", { timeout: 6000 }).should(
      "have-class",
      "ls-nav-active"
    );

    //explicit wait
    cy.get("[aria-lavel='jump to slide 2']", { timeout: 50000 }).should(
      ($x) => {
        expect($x).to.have.class("ls-nav-active");
      }
    );
  });

  it("login application", () => {
    cy.visit("http://eaapp.somee.com/");

    // cy.contains("Login").click();
    // Login action w. chai verify link text
    // cy.get("#loginLink").then(($link) => {
    //   const linkText = $link.text();
    //   expect(linkText).is.eql("Login");
    // });

    cy.get("#loginLink").invoke("text").as("linkText");

    // long way of doing promise(closure)
    // cy.get("#loginLink")
    //   .then(($link) => {
    //     return $link.text();
    //   })
    //   .as("linkText");

    cy.contains("Login").click();

    cy.get("@linkText").then(($x) => {
      expect($x).is.eql("Login");
    });

    cy.url().should("include", "/Account/Login");
    cy.login(user.UserName, user.Password);

    cy.contains("Employee List").click();

    // list all td within tr
    // cy.get(".table").find("tr > td");
    // cy.get(".table")
    //   .find("tr")
    //   .contains("Prashanth")
    //   .parent()
    //   .contains("Benefits")
    //   .click();

    // cy.get(".table").find("tr").as("rows");

    // // click all rows
    // cy.get("@rows").then(($row) => {
    //   cy.wrap($row).click({ multiple: true });
    // });

    // verify value from a property
    cy.wrap({ name: "Karthik" })
      .should("have.property", "name")
      .and("eq", "Karthik");

    // using wrap
    cy.get(".table")
      .find("tr > td")
      .then(($td) => {
        cy.wrap($td)
          .contains("John")
          .invoke("wrap")
          .parent()
          .contains("Benefits")
          .click();
      });
  });
});
