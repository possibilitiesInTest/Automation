/// <reference types="Cypress" />

describe('Newsletter', () => {
    beforeEach(() => {
      cy.task('seedDatabase');
    });
    it('should display a success message', () => {
        cy.intercept('POST', '/newsletter*', {status: 201}).as('subscribe');
        cy.visit('/');
        cy.get('[data-cy="newsletter-email"]').click()
        cy.get('[data-cy="newsletter-email"]').type('test@example.com');
        cy.get('[data-cy="newsletter-submit"]').click();
        cy.wait('@subscribe');
        cy.contains("Thanks for signing up!");
    });
    it('validation errors displayed when attempting to sign up for newsletter', () => {
        cy.intercept('POST', '/newsletter*', {message: 'Email exists already'}).as('subscribe');
        cy.visit('/');
        cy.get('[data-cy="newsletter-email"]').click()
        cy.get('[data-cy="newsletter-email"]').type('test@example.com');
        cy.get('[data-cy="newsletter-submit"]').click();
        cy.wait('@subscribe');
        cy.contains("Email exists already");
        
    });
});