package structural.composite;

public class MenuItemComposite {

	public static void main(String[] args) {
		Menu file = new Menu("File", "/file");
		Menu newFile = new Menu("New", "/new");
		
		
		
		MenuItem classItem = new MenuItem("Class", "/class");
		MenuItem interfaceItem = new MenuItem("interface", "/interface");
		
		newFile.add(interfaceItem);
		file.add(newFile);
		
		newFile.add(classItem);
		MenuItem openFile = new MenuItem("Open file..", "/openFile");
		
		file.add(openFile);
		
		String result = file.toString();
		
		System.out.println(result);
	}

}
