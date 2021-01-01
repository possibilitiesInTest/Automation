from selenium import webdriver

browser1 = webdriver.Chrome()
browser2 = webdriver.Chrome()

browser1.get("http://techstepacademy.com/training-ground")
browser2.get("http://www.google.com")

browser1.execute_script('window.open("http://techstepacademy.com/training-ground","_blank");')
browser1.execute_script('window.open("http://techstepacademy.com/training-ground","_blank");')
browser1.execute_script('window.open("http://techstepacademy.com/training-ground","_blank");')
browser1.execute_script('window.open("http://techstepacademy.com/training-ground","_blank");')