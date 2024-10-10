package frameworkRelatedQns;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebElement on which drag and drop operation needs to be performed
		WebElement fromElement = driver.findElement(By Locator of fromElement);

		//WebElement to which the above object is dropped
		WebElement toElement = driver.findElement(By Locator of toElement);

		//Creating object of Actions class to build composite actions
		Actions builder = new Actions(driver);

		//Building a drag and drop action
		Action dragAndDrop = builder.clickAndHold(fromElement)
		.moveToElement(toElement)
		.release(toElement)
		.build();

		//Performing the drag and drop action
		dragAndDrop.perform();

	}

}
