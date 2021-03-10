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
};
