/// <reference types="cypress" />

describe("Testing of EA App", () => {
  it("login application", () => {
    cy.visit("http://eaapp.somee.com/");

    // cy.contains("Login").click();

    // Login action w. chai verify link text
    // cy.get("#loginLink").then(($link) => {
    //   const linkText = $link.text();
    //   expect(linkText).is.eql("Login");
    // });

    cy.get("#loginLink").invoke("text").as("linkText");
    //   .then(($link) => {
    //     return $link.text();
    //   })
    //   .as("linkText");

    cy.contains("Login").click();

    cy.get("@linkText").then(($x) => {
      expect($x).is.eql("Login");
    });

    // expect will not work outside of codeblock
    // expect(linkText).is.eql('Login');

    cy.url().should("include", "/Account/Login");
    cy.get("#UserName").type("admin");
    cy.get("#Password").type("password");
    cy.get(".btn").click();

    cy.contains("Employee List").click();

    // list all td within tr
    cy.get(".table").find("tr > td");
    cy.get(".table")
      .find("tr")
      .contains("Prashanth")
      .parent()
      .contains("Benefits")
      .click();
  });
});
