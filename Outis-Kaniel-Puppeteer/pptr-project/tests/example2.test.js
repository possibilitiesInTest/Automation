// const puppeteer = require("puppeteer");

// describe("second puppeteer test", () => {
//   it("should launch the browser", async function () {
//     const browser = await puppeteer.launch({
//       headless: false,
//       slowMo: 10,
//       devtools: false,
//     });

//     const page = await browser.newPage();
//     await page.goto("https://devexpress.github.io/testcafe/example");
//     await page.type("#developer-name", "Mike", { delay: 0 });
//     await page.click("#tried-test-cafe", { clickCount: 1 });
//     await page.select("#preferred-interface", "JavaScript API");
//     const message = "filling textbox with some text";
//     await page.type("#comments", message);
//     await page.click("#submit-button");
//     await page.waitForSelector(".result-content");
//     await page.waitForTimeout(2000);
//     await browser.close();
//   });
// });
