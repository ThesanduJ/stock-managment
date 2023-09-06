import java.util.*;

class CourseWork {
	public static Scanner input = new Scanner(System.in);
	public static String user = "user";
	public static String password = "123";
	public static String[][] supplierIdAndName = new String[0][2];
	public static String[] itemCategory = new String[0];
	public static String[] itemCode = new String[0];
	public static String[][] seletedSupplierList = new String[0][2];
	public static String[] seletedCategoryList = new String[0];
	public static String[] description = new String[0];
	public static int[] unitPrice = new int[0];
	public static int[] qty = new int[0];
	public static int[] index = new int[0];

	public static void main(String args[]) throws InterruptedException {

		Login();
		homePage();
		homeOption();
	}

	public static void Login() throws InterruptedException {
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		System.out.println("|\t\t\t\t\t\tLOGIN PAGE\t\t\t\t\t\t\t|");
		Thread.sleep(250);
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);

		System.out.print("\nUser name : ");
		String userName = input.nextLine();

		while (!userName.equals(user)) {
			System.out.print("user name is invalid.please try again!");
			System.out.print("\n\nUser name : ");
			userName = input.nextLine();
		}

		System.out.print("\nPassword : ");
		String pass = input.nextLine();

		while (!pass.equals(password)) {
			System.out.print("password is incorrect.please try again!");
			System.out.print("\n\nPassword : ");
			pass = input.nextLine();
		}
		clearConsole();
	}

	public static void homePage() throws InterruptedException {
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		System.out.println("|\t\t\t\tWELCOME TO IJSE STOCK MANAGEMENT SYSTEM\t\t\t\t\t\t|");
		Thread.sleep(250);
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);

		System.out.print("\n\n[1] Change the Credentials\t\t");
		System.out.println("[2] Supplier Manage");
		System.out.print("[3] Stock Manage\t\t\t");
		System.out.println("[4] Log out");
		System.out.println("[5] Exit the system");
	}

	public static void homeOption() throws InterruptedException {
		System.out.print("\nEnter an option to continue > ");
		int option = input.nextInt();

		switch (option) {
			case 1:
				clearConsole();
				changeCredentials();
				break;
			case 2:
				clearConsole();
				supplierManage();
				break;
			case 3:
				clearConsole();
				stockManage();
				break;
			case 4:
				clearConsole();
				logOut();
				break;
			case 5:
				clearConsole();
				exit();
				break;
			default:
				System.out.println("\nInvalid option try again!");
				homeOption();
		}
	}

	public static void changeCredentials() throws InterruptedException {
		input.nextLine(); // InputMismatchException
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		System.out.println("|\t\t\t\t\t\tCREDENTIAL MANAGE\t\t\t\t\t\t|");
		Thread.sleep(250);
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		System.out.print("\nPlease enter the user name to verify it's you : ");
		String u = input.nextLine(); // u means user name
		while (!u.equals(user)) {
			System.out.println("invalid user name. try again!");
			System.out.print("\nPlease enter the user name to verify it's you : ");
			u = input.nextLine(); // u means user name
		}
		System.out.println("Hey " + u);
		System.out.print("\nEnter you current password : ");
		String pass = input.nextLine(); // pass means password
		while (!pass.equals(password)) {
			System.out.println("incorrect password. try again!");
			System.out.print("\nEnter you current password : ");
			pass = input.nextLine();
		}
		System.out.print("Enter you new password : ");
		password = input.nextLine();
		System.out.print("\nPassword change successfully! Do you want to go home page (Y/N): ");
		char option = input.next().charAt(0);
		if (option == 'y' || option == 'Y') {
			clearConsole();
			homePage();
			homeOption();
		} else {
			clearConsole();
			changeCredentials();
		}
	}

	public static void logOut() throws InterruptedException {
		input.nextLine(); // InputMismatchException
		Login();
		homePage();
		homeOption();
	}

	public static void exit() throws InterruptedException {
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\tThank ");
		Thread.sleep(250);
		System.out.print("you ");
		Thread.sleep(250);
		System.out.print("for ");
		Thread.sleep(250);
		System.out.print("using ");
		Thread.sleep(250);
		System.out.print("IJSE ");
		Thread.sleep(250);
		System.out.print("STOCK ");
		Thread.sleep(250);
		System.out.print("MANAGEMENT ");
		Thread.sleep(250);
		System.out.print("SYSTEM\t\t\t\t");
		Thread.sleep(250);
		System.exit(0);
	}

	public static void supplierManage() throws InterruptedException {
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		System.out.println("|\t\t\t\t\t\tSUPPLIER MANAGE\t\t\t\t\t\t\t|");
		Thread.sleep(250);
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);

		System.out.print("\n[1] Add Supplier\t\t");
		System.out.println("[2] Update Supplier");
		System.out.print("[3] Delete Supplier\t\t");
		System.out.println("[4] View Supplier");
		System.out.print("[5] Search Supplier\t\t");
		System.out.println("[6] Home page");

		SupplierOption();

	}

	public static void SupplierOption() throws InterruptedException {
		System.out.print("\nEnter an option to continue > ");
		int option = input.nextInt();
		switch (option) {
			case 1:
				clearConsole();
				addSupplier();
				break;
			case 2:
				clearConsole();
				updateSupplier();
				break;
			case 3:
				clearConsole();
				deleteSupplier();
				break;
			case 4:
				clearConsole();
				viewSuppliers();
				break;
			case 5:
				clearConsole();
				searchSupplier();
				break;
			case 6:
				clearConsole();
				homeMenu();
				break;
			default:
				System.out.println("\nInvalid option try again!");
				SupplierOption();

		}
	}

	public static void addSupplier() throws InterruptedException {

		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		System.out.println("|\t\t\t\t\t\tADD SUPPLIER\t\t\t\t\t\t\t|");
		Thread.sleep(250);
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);

		input.nextLine(); // InputMismatchException
		System.out.print("\nSupplier ID : ");
		supplierIdAndName = addSupplierLength(supplierIdAndName);
		supplierIdAndName[supplierIdAndName.length - 1][0] = input.nextLine();

		String id = "";
		for (int i = 0; i < supplierIdAndName.length; i++) {
			id = supplierIdAndName[i][0];
		}

		char id1 = id.charAt(0);
		while (id1 != 'S') {
			System.out.println("Invaild supplier ID format try again");
			System.out.print("\nSupplier ID : ");
			supplierIdAndName[supplierIdAndName.length - 1][0] = input.nextLine();

			for (int i = 0; i < supplierIdAndName.length; i++) {
				id = supplierIdAndName[i][0];
			}

			id1 = id.charAt(0);

		}
		String id3 = supplierIdAndName[supplierIdAndName.length - 1][0];
		int count = 0;
		for (int i = 0; i < supplierIdAndName.length; i++) {
			if (id3.equals(supplierIdAndName[i][0])) {
				count++;
			}
		}
		while (count > 1) {
			System.out.println("already exists. try another supplier id!");
			System.out.print("\nSupplier ID : ");
			supplierIdAndName[supplierIdAndName.length - 1][0] = input.nextLine();

			id = "";
			for (int i = 0; i < supplierIdAndName.length; i++) {
				id = supplierIdAndName[i][0];
			}

			id1 = id.charAt(0);
			while (id1 != 'S') {
				System.out.println("Invaild supplier ID format try again");
				System.out.print("\nSupplier ID : ");
				supplierIdAndName[supplierIdAndName.length - 1][0] = input.nextLine();

				for (int i = 0; i < supplierIdAndName.length; i++) {
					id = supplierIdAndName[i][0];
				}

				id1 = id.charAt(0);

			}
			id3 = supplierIdAndName[supplierIdAndName.length - 1][0];
			count = 0;
			for (int i = 0; i < supplierIdAndName.length; i++) {
				if (id3.equals(supplierIdAndName[i][0])) {
					count++;
				}
			}
		}

		System.out.print("Supplier Name : ");
		supplierIdAndName[supplierIdAndName.length - 1][1] = input.nextLine();

		System.out.print("\nadded successfully! Do you want to add another supplier(Y/N)? ");
		char option = input.next().charAt(0);

		if (option == 'y' || option == 'Y') {
			clearConsole();
			addSupplier();
		} else {
			clearConsole();
			supplierManage();
			SupplierOption();
		}

	}

	public static void updateSupplier() throws InterruptedException {
		input.nextLine(); // InputMismatchException
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		System.out.println("|\t\t\t\t\t\tUPDATE SUPPLIER\t\t\t\t\t\t\t|");
		Thread.sleep(250);
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		if (supplierIdAndName.length == 0) {
			System.out.println("\nDoesn't included any supplier details. Please add Supplier details!");
			System.out.print("Do you want to add supplier details(Y/N)?");
			char option = input.next().charAt(0);
			if (option == 'Y' || option == 'y') {
				clearConsole();
				addSupplier();
			}
		} else {
			System.out.print("\nSupplier ID  : ");
			String id = input.nextLine();

			boolean flag = true;
			for (int i = 0; i < supplierIdAndName.length; i++) {
				if (id.equals(supplierIdAndName[i][0])) {
					flag = false;
					break;
				}
			}
			while (flag) {
				System.out.println("can't find supplier id. try again!");
				System.out.print("\nSupplier ID  : ");
				id = input.nextLine();
				for (int i = 0; i < supplierIdAndName.length; i++) {
					if (id.equals(supplierIdAndName[i][0])) {
						flag = false;
					}
				}
			}
			int position = 0;
			for (int i = 0; i < supplierIdAndName.length; i++) {
				if (id.equals(supplierIdAndName[i][0])) {
					position = i;
					break;
				}
			}
			System.out.println("\nSupplier ID : " + supplierIdAndName[position][0]);
			System.out.println("Supplier Name : " + supplierIdAndName[position][1]);

			System.out.print("\nEnter the new supplier name : ");
			supplierIdAndName[position][1] = input.nextLine();

			System.out.print("Updated Successfully! Do you want to update another supplier?(Y/N) ");
			char option = input.next().charAt(0);

			if (option == 'Y' || option == 'y') {
				clearConsole();
				updateSupplier();
			} else {
				clearConsole();
				supplierManage();
				SupplierOption();
			}
		}
	}

	public static void deleteSupplier() throws InterruptedException {
		input.nextLine(); // InputMismatchException
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		System.out.println("|\t\t\t\t\t\tDELETE SUPPLIER\t\t\t\t\t\t\t|");
		Thread.sleep(250);
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		if (supplierIdAndName.length == 0) {
			System.out.println("\nDoesn't included any supplier details. Please add Supplier details!");
			System.out.print("Do you want to add supplier details(Y/N)?");
			char option = input.next().charAt(0);
			if (option == 'Y' || option == 'y') {
				clearConsole();
				addSupplier();
			}
		} else {
			System.out.print("\nSupplier ID : ");
			String id = input.nextLine();

			boolean flag = true;
			for (int i = 0; i < supplierIdAndName.length; i++) {
				if (id.equals(supplierIdAndName[i][0])) {
					flag = false;
					break;
				}
			}
			while (flag) {
				System.out.println("can't find supplier id. try again!");
				System.out.print("\nSupplier ID : ");
				id = input.nextLine();
				for (int i = 0; i < supplierIdAndName.length; i++) {
					if (id.equals(supplierIdAndName[i][0])) {
						flag = false;
					}
				}
			}
			int position = 0;
			for (int i = 0; i < supplierIdAndName.length; i++) {
				if (id.equals(supplierIdAndName[i][0])) {
					position = i;
				}
			}

			String[][] temp = new String[supplierIdAndName.length - 1][2];

			for (int i = 0, k = 0; i < supplierIdAndName.length; i++) {

				if (position == i) {
					continue;
				}
				for (int j = 0; j < supplierIdAndName[i].length; j++) {

					temp[k][j] = supplierIdAndName[i][j];

				}
				k++;
			}
			supplierIdAndName = temp;

			System.out.print("delete successfully! Do you want to delete another(Y/N)? ");
			char option = input.next().charAt(0);

			if (option == 'Y' || option == 'y') {
				clearConsole();
				deleteSupplier();
			} else {
				clearConsole();
				supplierManage();
				SupplierOption();
			}
		}
	}

	public static void viewSuppliers() throws InterruptedException {

		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		System.out.println("|\t\t\t\t\t\tView Suppliers\t\t\t\t\t\t\t|");
		Thread.sleep(250);
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);

		if (supplierIdAndName.length == 0) {
			System.out.println("\nDoesn't included any supplier details.try again!");
			System.out.print("Do you want to add supplier details(Y/N)?");
			char option = input.next().charAt(0);
			if (option == 'Y' || option == 'y') {
				clearConsole();
				addSupplier();
			}

		} else {
			System.out.println("\n");

			System.out.printf("+-------------------------------------+%n");
			System.out.printf("|%s|%s|%n", "   SUPPLIER ID   ", "   SUPPLIER NAME   ");
			System.out.printf("+-------------------------------------+%n");

			for (int i = 0; i < supplierIdAndName.length; i++) {
				System.out.printf("|%-17s|%-19s|%n", "     " + supplierIdAndName[i][0],
						"     " + supplierIdAndName[i][1]);
			}
			System.out.printf("+-------------------------------------+%n");
			System.out.print("\nDo you want to go supplier manage page(Y/N)? ");
			char option = input.next().charAt(0);

			if (option == 'Y' || option == 'y') {
				clearConsole();
				supplierManage();
				SupplierOption();
			} else {
				System.exit(0);
			}
		}
	}

	public static void searchSupplier() throws InterruptedException {
		input.nextLine(); // InputMismatchException
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		System.out.println("|\t\t\t\t\t\tSEARCH SUPPLIER\t\t\t\t\t\t\t|");
		Thread.sleep(250);
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		if (supplierIdAndName.length == 0) {
			System.out.println("\nDoesn't included any supplier details. Please add Supplier details!");
			System.out.print("Do you want to add supplier details(Y/N)?");
			char option = input.next().charAt(0);
			if (option == 'Y' || option == 'y') {
				clearConsole();
				addSupplier();
			}
		} else {
			System.out.print("\nSupplier ID : ");
			String id = input.nextLine();

			boolean flag = true;
			for (int i = 0; i < supplierIdAndName.length; i++) {
				if (id.equals(supplierIdAndName[i][0])) {
					flag = false;
					break;
				}
			}
			while (flag) {
				System.out.println("can't find supplier id.try again!");

				System.out.print("\nSupplier ID   : ");

				id = input.nextLine();
				for (int i = 0; i < supplierIdAndName.length; i++) {
					if (id.equals(supplierIdAndName[i][0])) {
						flag = false;
						break;
					}
				}
			}
			int position = 0;
			for (int i = 0; i < supplierIdAndName.length; i++) {
				if (id.equals(supplierIdAndName[i][0])) {
					position = i;
					break;
				}
			}

			System.out.println("Supplier Name : " + supplierIdAndName[position][1]);

			System.out.print("\nadded successfully! Do you want to add another find(Y/N)?");
			char option = input.next().charAt(0);

			if (option == 'Y' || option == 'y') {
				clearConsole();
				searchSupplier();
			} else {
				clearConsole();
				supplierManage();
				SupplierOption();
			}
		}
	}

	public static void homeMenu() throws InterruptedException {
		homePage();
		homeOption();
	}

	public static void stockManage() throws InterruptedException {
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		System.out.println("|\t\t\t\t\t\tSTOCK MANAGEMENT\t\t\t\t\t\t|");
		Thread.sleep(250);
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);

		System.out.print("\n[1] Manage Item Categories\t\t");
		System.out.println("[2] Add Item");
		System.out.print("[3] Get Item Supplier Wise\t\t");
		System.out.println("[4] View Item");
		System.out.print("[5] Rank Item Per Unit Price\t\t");
		System.out.println("[6] Home Page");

		stockOption();
	}

	public static void stockOption() throws InterruptedException {
		System.out.print("\nEnter an option to continue > ");
		int option = input.nextInt();

		switch (option) {
			case 1:
				clearConsole();
				manageItemCategories();
				break;
			case 2:
				clearConsole();
				addItem();
				break;
			case 3:
				clearConsole();
				itemsSupplierWise();
				break;
			case 4:
				clearConsole();
				viewItems();
				break;
			case 5:
				clearConsole();
				rankItemsPerUnitPrice();
				break;
			case 6:
				clearConsole();
				homeMenu();
				break;
			default:
				System.out.println("\nInvalid option try again.");
				stockOption();
		}
	}

	public static void manageItemCategories() throws InterruptedException {
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		System.out.println("|\t\t\t\t\t\tMANAGE ITEM CATEGORY\t\t\t\t\t\t|");
		Thread.sleep(250);
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);

		System.out.print("\n[1] Add New Item Category\t\t");
		System.out.println("[2] Delete Item Category");
		System.out.print("[3] Update Item Category\t\t");
		System.out.println("[4] Stock Management");

		manageItemCategoriesOption();
	}

	public static void manageItemCategoriesOption() throws InterruptedException {
		System.out.print("\nEnter an option to continue > ");
		int option = input.nextInt();

		switch (option) {
			case 1:
				clearConsole();
				addNewItemCategory();
				break;
			case 2:
				clearConsole();
				deleteCategories();
				break;
			case 3:
				clearConsole();
				updateCategories();
				break;
			case 4:
				clearConsole();
				stockManage();
				stockOption();
				break;
			default:
				System.out.println("\nInvalid option try again");
				manageItemCategoriesOption();
		}
	}

	public static void addNewItemCategory() throws InterruptedException {
		input.nextLine(); // InputMismatchException
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		System.out.println("|\t\t\t\t\t\tADD ITEM CATEGORY\t\t\t\t\t\t|");
		Thread.sleep(250);
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);

		System.out.print("\nEnter the item category : ");
		itemCategory = itemCategoryLength();
		itemCategory[itemCategory.length - 1] = input.nextLine();

		String uniqueCategory = itemCategory[itemCategory.length - 1];
		int count = 0;
		for (int i = 0; i < itemCategory.length; i++) {

			if (uniqueCategory.equals(itemCategory[i])) {
				count++;
			}
		}
		while (count > 1) {
			System.out.println("Item catogory can't be duplicate.try again!");
			System.out.print("\nEnter the item category : ");

			itemCategory[itemCategory.length - 1] = input.nextLine();

			uniqueCategory = itemCategory[itemCategory.length - 1];
			count = 0;
			for (int i = 0; i < itemCategory.length; i++) {

				if (uniqueCategory.equals(itemCategory[i])) {
					count++;
				}
			}
		}

		System.out.print("added successfully! Do you want to add another category(Y/N)? ");
		char option = input.next().charAt(0);
		if (option == 'y' || option == 'Y') {
			clearConsole();
			addNewItemCategory();
		} else {
			clearConsole();
			stockManage();
			stockOption();
		}
	}

	public static void deleteCategories() throws InterruptedException {
		input.nextLine(); // InputMismatchException
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		System.out.println("|\t\t\t\t\t\tDELETE ITEM CATEGORY\t\t\t\t\t\t|");
		Thread.sleep(250);
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		if (itemCategory.length == 0) {
			System.out.println("\nDoen't included any item category");
			System.out.print("Do you want to add Item Category(Y/N)?");
			char option = input.next().charAt(0);
			if (option == 'Y' || option == 'y') {
				clearConsole();
				addNewItemCategory();
			}
		} else {
			System.out.print("\nEnter the  item category you want to delete : ");
			String deleteCategory = input.nextLine();

			boolean flag = true;
			for (int i = 0; i < itemCategory.length; i++) {
				if (deleteCategory.equals(itemCategory[i])) {
					flag = false;
				}
			}
			while (flag) {
				System.out.println("can't find item category.try again!");
				System.out.print("\nEnter the  item category you want to delete : ");
				deleteCategory = input.nextLine();

				for (int i = 0; i < itemCategory.length; i++) {
					if (deleteCategory.equals(itemCategory[i])) {
						flag = false;
					}
				}
			}
			String[] temp = new String[itemCategory.length - 1];
			for (int i = 0, j = 0; i < itemCategory.length; i++) {
				if (deleteCategory.equals(itemCategory[i])) {
					continue;
				}
				temp[j++] = itemCategory[i];
			}

			itemCategory = temp;
			System.out.print("deleted successfully! Do you want to delete another(Y/N)?");
			char option = input.next().charAt(0);

			if (option == 'y' || option == 'y') {
				clearConsole();
				deleteCategories();
			} else {
				clearConsole();
				stockManage();
				stockOption();
			}
		}
	}

	public static void updateCategories() throws InterruptedException {
		input.nextLine(); // InputMismatchException
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		System.out.println("|\t\t\t\t\t\tUPDATE CATEGORY\t\t\t\t\t\t\t|");
		Thread.sleep(250);
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		if (itemCategory.length == 0) {
			System.out.println("\nDoen't included any item category");
			System.out.print("Do you want to add Item Category(Y/N)?");
			char option = input.next().charAt(0);
			if (option == 'Y' || option == 'y') {
				clearConsole();
				addNewItemCategory();
			}
		} else {
			System.out.print("\nEnter the  item category you want to update : ");
			String updateCategory = input.nextLine();

			int position = 0;
			boolean flag = true;
			for (int i = 0; i < itemCategory.length; i++) {
				if (updateCategory.equals(itemCategory[i])) {
					flag = false;
					break;
				}
			}
			while (flag) {
				System.out.println("can't find item category. try again!");
				System.out.print("\nEnter the  item category you want to update : ");
				updateCategory = input.nextLine();

				for (int i = 0; i < itemCategory.length; i++) {
					if (updateCategory.equals(itemCategory[i])) {
						flag = false;
						break;
					}
				}
			}
			for (int i = 0; i < itemCategory.length; i++) {
				if (updateCategory.equals(itemCategory[i])) {
					position = i;
				}
			}
			System.out.print("Enter the updated item category : ");
			itemCategory[position] = input.nextLine();

			System.out.print("\nUpdated Successfully! Do you want to update another supplier?(Y/N) ");
			char option = input.next().charAt(0);

			if (option == 'y' || option == 'Y') {
				clearConsole();
				updateCategories();
			} else {
				clearConsole();
				stockManage();
				stockOption();

			}
		}
	}

	public static void addItem() throws InterruptedException {
		input.nextLine(); // InputMismatchException
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		System.out.println("|\t\t\t\t\t\tADD ITEM\t\t\t\t\t\t\t|");
		Thread.sleep(250);
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);

		if (itemCategory.length == 0) {
			System.out.println("\nOOPS! It seems that you don't have any item categories in the system.");
			System.out.print("Do you want to add a new item category(Y/N)? ");
			char option = input.next().charAt(0);

			if (option == 'Y' || option == 'y') {
				clearConsole();
				addNewItemCategory();
			} else {
				clearConsole();
				stockManage();
				stockOption();
			}
		}
		if (supplierIdAndName.length == 0) {
			System.out.println("OOPS! It seems that you don't have any suppliers in the system");
			System.out.print("DO you want to add a new supplier(Y/N)? ");
			char option = input.next().charAt(0);

			if (option == 'Y' || option == 'y') {
				clearConsole();
				addSupplier();
			} else {
				clearConsole();
				stockManage();
				stockOption();
			}
		}
		System.out.print("\nItem Code : ");
		itemCode = itemLength();
		itemCode[itemCode.length - 1] = input.nextLine();
		String iCode = itemCode[itemCode.length - 1];
		int count = 0;

		for (int i = 0; i < itemCode.length; i++) {
			if (iCode.equals(itemCode[i])) {
				count++;
			}
		}

		while (count > 1) {
			System.out.println("already exists. try another Item code!");
			System.out.print("\nItem Code : ");

			itemCode[itemCode.length - 1] = input.nextLine();
			iCode = itemCode[itemCode.length - 1];
			count = 0;

			for (int i = 0; i < itemCode.length; i++) {
				if (iCode.equals(itemCode[i])) {
					count++;
				}
			}
		}
		char codeFormat = iCode.charAt(0);
		while (codeFormat != 'I') {
			System.out.println("Invaild Item code format try again!");
			System.out.print("\nItem Code : ");
			itemCode = itemLength();
			itemCode[itemCode.length - 1] = input.nextLine();
			iCode = itemCode[itemCode.length - 1];
			codeFormat = iCode.charAt(0);
		}
		System.out.println("\nSupplier list : \n");
		System.out.println("+-----+----------------------------+-----------------------------+");
		System.out.printf("|%s|%s|%s|%n", "  #  ", "       SUPPLIER ID          ", "       SUPPLIER NAME         ");
		System.out.println("+-----+----------------------------+-----------------------------+");

		for (int i = 0; i < supplierIdAndName.length; i++) {
			System.out.printf("|%-5d|%-28s|%-29s|%n", (i + 1), supplierIdAndName[i][0], supplierIdAndName[i][1]);
		}
		System.out.println("+-----+----------------------------+-----------------------------+");

		System.out.print("\nEnter the supplier number > ");
		int sIndex = input.nextInt();
		seletedSupplierList = seletedSupplierList();
		seletedSupplierList[seletedSupplierList.length - 1][0] = supplierIdAndName[sIndex - 1][0];
		seletedSupplierList[seletedSupplierList.length - 1][1] = supplierIdAndName[sIndex - 1][1];

		System.out.println("\nItem Categories : \n");

		System.out.println("+-----+-----------------------------+");
		System.out.printf("|%s|%s|%n", "  #  ", "      CATEGORY NAME          ");
		System.out.println("+-----+-----------------------------+");

		for (int i = 0; i < itemCategory.length; i++) {
			System.out.printf("|%-5d|%-29s|%n", (i + 1), itemCategory[i]);
		}
		System.out.println("+-----+-----------------------------+");

		System.out.print("\nEnter the category number > ");
		int cIndex = input.nextInt();
		seletedCategoryList = seletedCategoryList();
		seletedCategoryList[seletedCategoryList.length - 1] = itemCategory[cIndex - 1];
		input.nextLine(); // InputMismatchException
		System.out.print("\nDescription : ");
		description = desc();
		description[description.length - 1] = input.nextLine();

		System.out.print("Unit price    : ");
		unitPrice = unitPrice();
		unitPrice[unitPrice.length - 1] = input.nextInt();

		System.out.print("Qty on hand   : ");
		qty = qty();
		qty[qty.length - 1] = input.nextInt();

		System.out.print("\nadded successfully! Do you want to add another Item(Y/N)?");
		char option = input.next().charAt(0);

		if (option == 'y' || option == 'Y') {
			clearConsole();
			addItem();
		} else {
			clearConsole();
			stockManage();
			stockOption();
		}
	}

	public static void itemsSupplierWise() throws InterruptedException {
		input.nextLine(); // InputMismatchException
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		System.out.println("|\t\t\t\t\t\tSEARCH SUPPLIER\t\t\t\t\t\t\t|");
		Thread.sleep(250);
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		if (itemCode.length <= 0) {
			System.out.println("\nDoesn't have any item.");
			System.out.print("Do you want to add Item (Y/N)?");
			char option = input.next().charAt(0);
			if (option == 'Y' || option == 'y') {
				clearConsole();
				addItem();
			}
		} else {
			System.out.print("\nEnter Supplier Id : ");
			String sId = input.nextLine(); // supplier id
			boolean flag = true;
			for (int i = 0; i < seletedSupplierList.length; i++) {
				if (sId.equals(seletedSupplierList[i][0])) {
					flag = false;
					index = index();
					index[index.length - 1] = i;

				}
			}
			while (flag) {
				System.out.println("Invalid Supplier Id.try again!");
				System.out.print("\nEnter Supplier Id : ");
				sId = input.nextLine();
				for (int i = 0; i < seletedSupplierList.length; i++) {
					if (sId.equals(seletedSupplierList[i][0])) {
						flag = false;
						index = index();
						index[index.length - 1] = i;

					}
				}
			}
			System.out.println("supplier Name : " + seletedSupplierList[index[0]][1]);
			System.out.println("\n");
			System.out.println(
					"+---------------------+----------------------+----------------------+-------------------------+-----------------------+");
			System.out.printf("|%S|%S|%S|%S|%S|%n", "     item code       ", "     description      ",
					"     unit price       ", "      qty on hand        ", "       category        ");
			System.out.println(
					"+---------------------+----------------------+----------------------+-------------------------+-----------------------+");

			
			for (int i = 0; i < index.length; i++) {
				System.out.printf("|%-21s|%-22s|%-22d|%-25d|%-23s|%n", itemCode[index[i]], description[index[i]],
						unitPrice[index[i]], qty[index[i]], seletedCategoryList[index[i]]);
							break;
			}
			
			System.out.println(
					"+---------------------+----------------------+----------------------+-------------------------+-----------------------+");

			System.out.print("\nsearch sucessfully! Do you want to another search(Y/N)?");
			char option = input.next().charAt(0);

			if (option == 'Y' || option == 'y') {
				clearConsole();
				itemsSupplierWise();
			} else {
				clearConsole();
				stockManage();
				stockOption();
			}
		}
	}

	public static void viewItems() throws InterruptedException {
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		System.out.println("|\t\t\t\t\t\tVIEW ITEMS\t\t\t\t\t\t\t|");
		Thread.sleep(250);
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		if (itemCode.length == 0) {
			System.out.println("\nDoesn't have any item included.try again!");
			System.out.print("Do you want to add Item (Y/N)?");
			char option = input.next().charAt(0);
			if (option == 'Y' || option == 'y') {
				clearConsole();
				addItem();
			}
		} else {
			for (int i = 0; i < seletedSupplierList.length; i++) {

				System.out.println("\n" + seletedCategoryList[i] + " : \n");
				System.out.println(
						"+--------------------+----------------------+-----------------------+---------------------+-----------------+");
				System.out.printf("|%S|%S|%S|%S|%S|%n", "        sid         ", "        code          ",
						"        desc           ", "       price         ", "       qty       ");
				System.out.println(
						"+--------------------+----------------------+-----------------------+---------------------+-----------------+");

				System.out.printf("|%-20s|%-22s|%-23s|%-21d|%-17d|%n", seletedSupplierList[i][0], itemCode[i],
						description[i], unitPrice[i], qty[i]);
				System.out.println(
						"+--------------------+----------------------+-----------------------+---------------------+-----------------+");

			}
			System.out.print("\nDo you want to go stock manage page(Y/N)?");
			char option = input.next().charAt(0);

			if (option == 'Y' || option == 'y') {
				clearConsole();
				stockManage();
				stockOption();
			} else {
				System.exit(0);
			}
		}
	}

	public static void rankItemsPerUnitPrice() throws InterruptedException {
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		System.out.println("|\t\t\t\t\t\tRANKED UNIT PRICE\t\t\t\t\t\t|");
		Thread.sleep(250);
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------+");
		Thread.sleep(250);
		if (itemCode.length == 0) {
			System.out.println("\nDoesn't have any item included.try again!");
			System.out.print("Do you want to add Item (Y/N)?");
			char option = input.next().charAt(0);
			if (option == 'Y' || option == 'y') {
				clearConsole();
				addItem();
			}
		} else {
			int[] rankPrice = Arrays.copyOf(unitPrice, unitPrice.length);
			int[] index = new int[unitPrice.length];
			int temp = 0;

			for (int i = 0; i < rankPrice.length; i++) {
				for (int j = 0; j < rankPrice.length - 1; j++) {
					if (rankPrice[j] > rankPrice[j + 1]) {
						temp = rankPrice[j];
						rankPrice[j] = rankPrice[j + 1];
						rankPrice[j + 1] = temp;
					}
				}
			}
			int k = 0;
			for (int i = 0; i < index.length; i++) {
				for (int j = 0; j < index.length; j++) {
					if (rankPrice[i] == unitPrice[j]) {
						index[k++] = j;
						break;
					}
				}
			}
			System.out.println("\n");

			System.out.println(
					"+--------------------+----------------------+-----------------------+---------------------+-----------------+---------------------+");
			System.out.printf("|%S|%S|%S|%S|%S|%S|%n", "        sid         ", "        code          ",
					"        desc           ", "       price         ", "       qty       ", "        cat          ");
			System.out.println(
					"+--------------------+----------------------+-----------------------+---------------------+-----------------+---------------------+");
			for (int i = 0; i < index.length; i++) {
				System.out.printf("|%-20s|%-22s|%-23s|%-21d|%-17d|%-21s|%n", seletedSupplierList[index[i]][0],
						itemCode[index[i]], description[index[i]], unitPrice[index[i]], qty[index[i]],
						seletedCategoryList[index[i]]);
			}
			System.out.println(
					"+--------------------+----------------------+-----------------------+---------------------+-----------------+---------------------+");

			System.out.print("\nDo you want to go stock manage page(Y/N)?");
			char option = input.next().charAt(0);

			if (option == 'y' || option == 'Y') {
				clearConsole();
				stockManage();
				stockOption();
			} else {
				System.exit(0);
			}

			input.close(); // closing Scanner
		}
	}

	public static int[] index() {
		int[] temp = new int[index.length + 1];
		for (int i = 0; i < index.length; i++) {
			temp[i] = index[i];
		}
		return temp;
	}

	public static int[] qty() {
		int[] temp = new int[qty.length + 1];
		for (int i = 0; i < qty.length; i++) {
			temp[i] = qty[i];
		}
		return temp;
	}

	public static int[] unitPrice() {
		int temp[] = new int[unitPrice.length + 1];
		for (int i = 0; i < unitPrice.length; i++) {
			temp[i] = unitPrice[i];
		}
		return temp;
	}

	public static String[] desc() {
		String[] temp = new String[description.length + 1];
		for (int i = 0; i < description.length; i++) {
			temp[i] = description[i];
		}
		return temp;
	}

	public static String[] seletedCategoryList() {
		String[] temp = new String[seletedCategoryList.length + 1];
		for (int i = 0; i < seletedCategoryList.length; i++) {
			temp[i] = seletedCategoryList[i];
		}
		return temp;
	}

	public static String[][] seletedSupplierList() {
		String[][] temp = new String[seletedSupplierList.length + 1][2];
		for (int i = 0; i < seletedSupplierList.length; i++) {
			for (int j = 0; j < seletedSupplierList[i].length; j++) {
				temp[i][j] = seletedSupplierList[i][j];
			}
		}
		return temp;
	}

	public static String[] itemLength() {
		String[] temp = new String[itemCode.length + 1];
		for (int i = 0; i < itemCode.length; i++) {
			temp[i] = itemCode[i];
		}
		return temp;
	}

	public static String[][] addSupplierLength(String[][] supplierIdAndName) {
		String[][] temp = new String[supplierIdAndName.length + 1][2];
		for (int i = 0; i < supplierIdAndName.length; i++) {
			for (int j = 0; j < supplierIdAndName[i].length; j++) {
				temp[i][j] = supplierIdAndName[i][j];
			}

		}
		return temp;
	}

	public static String[] itemCategoryLength() {
		String[] temp = new String[itemCategory.length + 1];
		for (int i = 0; i < itemCategory.length; i++) {
			temp[i] = itemCategory[i];
		}
		return temp;
	}

	private final static void clearConsole() {
		final String os = System.getProperty("os.name");
		try {
			if (os.equals("Linux")) {
				System.out.print("\033\143");
			} else if (os.equals("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		} catch (final Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
