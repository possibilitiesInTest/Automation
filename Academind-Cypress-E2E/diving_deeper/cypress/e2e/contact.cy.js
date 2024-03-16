/// <reference types="Cypress" />

describe('page navigation', () => {
    it('should navigate between pages', () => {
      cy.visit('http://localhost:5173/about');
        cy.get('[data-cy="contact-input-message"]').type('Hellow World!');
        cy.get('[data-cy="contact-input-name"]').type('John Doe');
        cy.get('[data-cy="contact-btn-submit"]').then((el) => {
            expect(el.attr('disabled')).to.be.undefined;
            expect(el.text()).to.eq('Send Message');
        })
        cy.get('[data-cy="contact-input-email"]').type('text@example.com{enter}');
        

        // cy.get('[data-cy="contact-btn-submit"]')
        //     .contains('Send Message')
        //     .and('not.have.attr', 'disabled');

        /*
        // btn const works, but is not recommended
        // instead use alias
        const btn = cy.get('[data-cy="contact-btn-submit"]');
        btn.click();
        btn.contains('Sending...');
        btn.get('[data-cy="contact-btn-submit"]').should('have.attr', 'disabled');  
        */

        cy.get('[data-cy="contact-btn-submit"]').as('submitBtn');
        cy.get('@submitBtn').click();
        cy.get('@submitBtn').contains('Sending...');
        cy.get('@submitBtn').should('have.attr', 'disabled');  
    });
});