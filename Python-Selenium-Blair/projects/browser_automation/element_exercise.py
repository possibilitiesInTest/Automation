from selenium import webdriver

browser = webdriver.Chrome()

browser.get("https://techstepacademy.com/training-ground")

input2_css_locator = 'input[id="ipt2"]'
button_xpath_locator = "//button[@id='b4']"

# Assign elements
input2_elem = browser.find_element_by_css_selector(input2_css_locator)
butn4_elem = browser.find_element_by_xpath(button_xpath_locator)

# Manipulate elements
input2_elem.send_keys("test text")
butn4_elem.click()