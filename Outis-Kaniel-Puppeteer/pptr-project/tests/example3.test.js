const { expect, should } = require("chai");
const puppeteer = require("puppeteer");

const {
  click,
  getCount,
  getText,
  typeText,
  waitForText,
  shouldNotExist,
} = require("../lib/helpers");

describe("My third puppeteer test", () => {
  let browser;
  let page;

  before(async function () {
    browser = await puppeteer.launch({
      headless: true,
      slowMo: 10,
      devtools: false,
    });
    page = await browser.newPage();
    await page.setDefaultTimeout(10000);
    await page.setDefaultNavigationTimeout(20000);
  });

  after(async function () {
    await browser.close();
  });

  beforeEach(async function () {
    // runs before each IT block
  });

  afterEach(async function () {
    // runs after each IT block
  });

  it("testing the browser", async function () {
    // const browser = await puppeteer.launch({
    //   headless: false,
    //   slowMo: 10,
    //   devtools: false,
    // });
    // const page = await browser.newPage();

    // await page.setDefaultTimeout(10000);
    // await page.setDefaultNavigationTimeout(20000);

    await page.goto("https://example.com/");
    await page.waitForXPath("//h1");
    const title = await page.title();
    const url = await page.url();
    // // const text = await page.$eval("h1", (element) => element.textContent);
    // const count = await page.$$eval("p", (elm) => elm.length);
    const text = await getText(page, "h1");
    const count = await getCount(page, "p");

    console.log("Text in the H1:" + text);
    console.log("Number of p tags: " + count);

    expect(title).to.be.a("string", "Example Domain");
    expect(url).to.include("example.com");
    expect(text).to.be.a("string", "Example Domain");
    expect(count).to.be.equal(2);

    await page.goto("http://zero.webappsecurity.com/index.html");
    // await page.waitForSelector("#signin_button");
    // await page.click("#signin_button");
    await click(page, "#signin_button");

    // // await page.waitForTimeout(() => !document.querySelector("#signin_button"));
    // await page.waitForSelector("#signin_button", {
    //   hidden: true,
    //   timeout: 3000,
    // });
    await page.waitForTimeout(2000);
    await shouldNotExist(page, "#signin_button");

    // await page.waitForSelector("#searchTerm");
    // await page.type("#searchTerm", "Hello World");
    // await page.keyboard.press("Enter", { delay: 10 });
    // await page.waitForTimeout(5000);

    // await browser.close();
  });
});
