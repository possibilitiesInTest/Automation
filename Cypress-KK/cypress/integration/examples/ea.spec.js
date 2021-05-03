/// <reference types="cypress" />

describe("Testing of EA App", () => {
  it("login application", () => {
    cy.visit("http://eaapp.somee.com/");
    cy.contains("Login").click();
    cy.url().should("include", "/Account/Login");
    cy.get("#UserName").type("admin");
    cy.get("#Password").type("password");
    cy.get(".btn").click();

    cy.contains("Employee List").click();

    // list all td within tr
    cy.get(".table").find("tr > td");
    cy.get(".table")
      .find("tr")
      .contains("Prasanth")
      .parent()
      .contains("Benefits")
      .click();
  });
});
