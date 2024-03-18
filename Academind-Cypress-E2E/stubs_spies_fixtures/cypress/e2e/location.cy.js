/// <reference types="cypress" />

describe('share location', () => {
  beforeEach(() => {
    cy.visit('/').then((window) => {
      cy.stub(window.navigator.geolocation, 'getCurrentPosition')
      .as('getUserPosition')
      .callsFake((cb) => {
        setTimeout(() => {
        cb({
          coords: {
            latitude: 37.5,
            longitude: 48.01,
          },
        });
      }, 100);
      });
      cy.stub(window.navigator.clipboard, 'writeText')
      .as('saveToClipboard')
      .resolves();
    });
  });

  it('should fetch the user location', () => {
    cy.get('[data-cy="get-loc-btn"]').click();
    cy.get('@getUserPosition').should('have.been.called');
    cy.get('[data-cy="get-loc-btn"]').should('be.disabled');
    cy.get('[data-cy="actions"]').should('contain', 'Location fetched') // Contains
  });

  it('should share a users location', () => {
    cy.get('[data-cy="name-input"]').type('John Doe');
    cy.get('[data-cy="get-loc-btn"]').click();
    cy.get('[data-cy="share-loc-btn"]').click();
    cy.get('@saveToClipboard').should('have.been.called')
  });

  it('should sdare a location URL', () => {
    cy.get('[data-cy="name-input"]').type('John Doe');
    cy.get('[data-cy="get-loc-btn"]').click();
    cy.get('[data-cy="share-loc-btn').click();
    cy.get('@saveToClipboard').should('have.been.called');
    cy.get('@saveToClipboard')
      .should('have.been.calledWithMatch', 
      new RegExp(`${37.5}.*${48.01}.*${encodeURI('John Doe')}`)
    )      
  });
});
