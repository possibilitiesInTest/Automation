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

    it('should validate the form input', () => {
        cy.visit('http://localhost:5173/about');
        cy.get('[data-cy="contact-btn-submit"]').as('submitBtn');
        cy.get('@submitBtn').click();
        cy.get('@submitBtn').then(el => {
            expect(el).to.not.have.attr('disabled');
            expect(el.text()).to.not.equal('Sending...');
        });
        cy.get('@submitBtn').contains('Send Message');
        cy.get('[data-cy="contact-input-message"]').blur();
        cy.get('[data-cy="contact-input-message"]')
            .parent()
            .should('have.attr', 'class').and('match', /invalid/);


            // fails in npx cypres run
            // .then((el) => {
            //     expect(el.attr('class')).to.contains('invalid');
            // })
        
        cy.get('[data-cy="contact-input-name"]').focus().blur();
        cy.get('[data-cy="contact-input-name"]')
            .parent()
            .should('have.attr', 'class').and('match', /invalid/);
            // .then((el) => {
            //     expect(el.attr('class')).to.contains('invalid');
            // })

        cy.get('[data-cy="contact-input-email"]').focus().blur();
        cy.get('[data-cy="contact-input-email"]')
            .parent()
            .should('have.attr', 'class').and('match', /invalid/);
            // .then((el) => {
            //     expect(el.attr('class')).to.contains('invalid');
            // })

    });
});