from selenium.webdriver.common.by import By

from base_element import BaseElement
from base_page import BasePage
from locator import Locator


class TrainingGroundPage(BasePage):
    url = 'https://techstepacademy.com/training-ground/'

    @property
    def button1(self):
        locator = Locator(by=By.ID, value='b1')
        return BaseElement(
            driver=self.driver,
            locator = locator
        )


"""
    def __init__(self, driver):
        self.driver = driver
        self.url = 'https://techstepacademy.com/training-ground'

    def go(self):
        self.driver.get(self.url)
"""
