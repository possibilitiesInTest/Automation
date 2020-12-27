from selenium import webdriver
from selenium.webdriver.support.select import Select

browser = webdriver.Chrome()
browser.get("http://techstepacademy.com/training-ground")

sel = browser.find_element_by_id('sel1')
my_select = Select(sel)

my_select.select_by_value('second')
my_select.select_by_index(0)
my_select.select_by_visible_text('Battlestar Galactica')

my_select.first_selected_option.text


