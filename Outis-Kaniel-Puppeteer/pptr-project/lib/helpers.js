module.exports = {
  click: async function (page, selector) {
    try {
      await page.waitForSelector(selector);
      await page.click(selector);
    } catch (error) {
      throw new Error(`Could not click on selector: ${selector}`);
    }
  },
  getText: async function (page, selector) {
    try {
      await page.waitForSelector(selector);
      return await page.$eval(selector, (elm) => elm.innerHTML);
    } catch (error) {
      throw new Error(`Cannot get test from selector: ${selector}`);
    }
  },
  getCount: async function (page, selector) {
    try {
      await page.waitForSelector(selector);
      return await page.$$eval(selector, (elm) => elm.length);
    } catch (error) {
      throw new Error(`Cannot getcount of selector: ${selector}`);
    }
  },
  typeText: async function (page, selector) {
    try {
      await page.waitForSelector(selector);
      await page.type(selector, text);
    } catch (error) {
      throw new Error(`Could not type into selector: ${selector}`);
    }
  },
  waitForText: async function (page, selector, text) {
    try {
      await page.waitForSelector(selector);
      await page.waitForFunction((selector, text) => {
        document.querySelector(selector).innerText.includes(text),
          {},
          selector,
          text;
      });
    } catch (error) {
      throw new Error(`Text: ${text} not found for selector: ${selector}`);
    }
  },
  shouldNotExist: async function (page, selector) {
    try {
      // await page.waitForTimeout(() => !document.querySelector(selector));
      // above doesn't work if webpage is hiding the elment
      await page.waitForSelector(selector, { hidden: true });
    } catch (error) {
      throw new Error(`Selector: ${selector} is visible, but should not be.`);
    }
  },
};
