import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("------------------------------------------------------");
            System.out.println("Welcome! Please choose one from the following options:");
            System.out.println("------------------------------------------------------");
            System.out.println("Main menu");
            System.out.println("1) Import data");
            System.out.println("2) Display data");
            System.out.println("3) Exit");
            System.out.print("Enter your choice: ");
            String choice = reader.readLine();
            switch (choice) {
                case "1":
                    importMenu(reader);
                    break;
                case "2":
                    displayMenu(reader);
                    break;
                case "3":
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }


    public static void importMenu(BufferedReader reader) throws Exception {
        while (true) {


            System.out.println("Import Menu");
            System.out.println("1) Import data days per issue");
            System.out.println("2) Import data Weekly issues");
            System.out.println("3) Weekly pull request comments per engineer");
            System.out.println("4) Weekly PR reviews per engineer");
            System.out.println("5) Back to main menu");
            System.out.print("Enter your choice: ");
            String choice = reader.readLine();

            switch (choice) {
                case "1":
                    //importGithubUserActivities();
                    System.out.println("to be done");
                    break;
                case "2":
                    System.out.println("to be done");
                    break;
                case "3":
                    System.out.println("to be done");
                    break;
                case "4":
                    System.out.println("to be done");
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void displayMenu(BufferedReader reader) throws Exception {
        while (true) {

            System.out.println("Display data menu:");
            System.out.println("1) Display days per issue");
            System.out.println("2) Display Weekly issues");
            System.out.println("3) Display Weekly pull request comments per engineer");
            System.out.println("4) Display Weekly PR reviews per engineer.");
            System.out.println("5) Back to main menu");
            System.out.print("Enter your choice: ");
            String choice = reader.readLine();


            switch (choice) {
                case "1":
                    System.out.println("to be done");
                    break;
                case "2":
                    System.out.println("to be done");
                    break;
                case "3":
                    System.out.println("to be done");
                    break;
                case "4":
                    System.out.println("to be done");
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

/*

    public static void importGithubUserActivities() throws Exception {
        // URL of the API endpoint
        String url = "https://api.github.com/users/octocat/events";

        // Create a Url object from the API endpoint
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // Set the request method to GET
        con.setRequestMethod("GET");

        // Get the response code
        int responseCode = con.getResponseCode();

        // If the response code is 200 (HTTP_OK) then continue
        if(responseCode == HttpURLConnection.HTTP_OK) {
            // Read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Print the response
            System.out.println("Response: " + response.toString());

            // Save the response to a JSON file
            try (FileWriter file = new FileWriter("output.json")) {
                file.write(response.toString());
                System.out.println("Successfully Copied JSON Object to File...");
            }
        } else {
            System.out.println("GET request not worked");
        }
    }
}
*/