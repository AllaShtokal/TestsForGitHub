package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CareersPage extends TestBase {



    public CareersPage() {
        PageFactory.initElements(driver, this);
    }

    //open all positions

    public List<String> showAllPositions() {

        List<String> items = new ArrayList<String>();

        for (int n = 1; n < 14; n++) {
            WebElement position = driver.findElement(By.xpath("//body/div[4]/main[1]/div[2]/div[1]/div[5]/div[" + n +
                    "]/div[1]/button[1]"));

            items.add(position.getText());

        }
        return items;
    }

    public void writeIntoFile(List<String> allPositions) {

        try {
            FileWriter myWriter = new FileWriter("src/main/resources/filename.txt", true);
            for (String item : allPositions) {

                myWriter.write(item + "\n");
                System.out.println(item);
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }



}
