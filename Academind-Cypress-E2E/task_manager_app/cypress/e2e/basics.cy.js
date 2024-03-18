/// <reference types="Cypress" />

describe('tasks page', () => {
  it('should render the main page', () => {
    cy.visit('http://localhost:5173/');
    cy.get('.main-header').find('img');
    // cy.get('.main-header img'); // also works
  })
  it('should display the title', () => {
    cy.visit('http://localhost:5173/');
    cy.get('h1').should('have.length', 1);
    cy.get('h1').contains("React Tasks");
  });
  
})