from selenium import webdriver

browser = webdriver.Chrome()

browser.get("https://techstepacademy.com/trial-of-the-stones")

# Riddle of the Stones
stone_input = browser.find_element_by_id('r1Input')
stone_answer_butn = browser.find_element_by_css_selector("button#r1Btn")
stone_result = browser.find_element_by_css_selector("div#passwordBanner > h4")
secrets_input = browser.find_element_by_id('r2Input')
secrets_answer_butn = browser.find_element_by_css_selector("button#r2Butn")

# Two Merchants
richest_merchant_name = browser.find_element_by_xpath("//p[text()='3000'] /../span").text
merchant_input = browser.find_element_by_id('r3input')
merchant_answer_butn = browser.find_element_by_css_selector("button#r3Butn")
check_butn = browser.find_element_by_css_selector("button[name='checkButn']")
complete_msg = browser.find_element_by_css_selector("dic#trialCompleteBanner h4")

stone_input.send_keys('rock')
stone_answer_butn.click()
password = stone_result.text

secrets_input.send_keys(richest_merchant_name)
secrets_answer_butn.click()

check_butn.click()
assert complete_msg.text == 'Trial Complete'