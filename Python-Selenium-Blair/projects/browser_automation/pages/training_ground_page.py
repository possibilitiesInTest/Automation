from selenium.webdriver.common.by import By

from base_element import BaseElement
from base_page import BasePage


class TrainingGroundPage(BasePage):
    url = 'https://techstepacademy.com/training-ground/'

    @property
    def button1(self):
        locator = (By.ID, 'b1')
        return BaseElement(
            driver=self.driver,
            by=locator[0],
            value=locator[1]
        )


"""
    def __init__(self, driver):
        self.driver = driver
        self.url = 'https://techstepacademy.com/training-ground'

    def go(self):
        self.driver.get(self.url)
"""
