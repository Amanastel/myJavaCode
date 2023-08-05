 <h1 align="center">Shopzilla</h1> 
 

<div align="center">
  <img alt="Demo" src="ReadmeImages/Shopzilla.png" />
</div>
<h2 align="center">🌟  Unlocking the Power of Seamless Shopping Delights 🌟</h2>

  
<br>
<br>
Welcome to Shopzilla, the cutting-edge automated application software for seamless buying and selling. Our platform connects registered buyers and sellers, revolutionizing the online shopping experience. Sellers can easily list their products, set prices, and manage inventory. Buyers enjoy a wide range of products and competitive prices. Our platform administrators ensure data integrity and maintain a secure environment. With Shopzilla, buyers and sellers can transact directly without the need for customer support. Join us today and discover the convenience of our streamlined online marketplace.

## Users of the System 👤
1. Administrator
2. Buyer
3. Seller

# Admin Role ⭐

🔒 **Login and Logout**: Admins securely log in to the system and log out when their session is complete.

🔍 **Transaction Monitoring**: Admins have access to view all transactions occurring on the platform, allowing them to monitor the flow of buying and selling activities.

🔎 **Transaction Filtering**: Admins can apply filters to view transactions based on transaction ID facilitating targeted monitoring of specific transaction types.

📅 **Transaction Search by Date Range**: Admins can search for transactions within a specific date range, helping them analyze and track transactions during specific time periods.

🗂️ **Transaction Sorting**: Admins can sort transactions based on different parameters such as date, payment amount, GST percentage assisting in organizing and analyzing transaction data.

👥 **Active Sellers Overview**: Admins can monitor the list of active sellers, providing insights into the number and activity level of sellers on the platform.

👥 **Active Buyers Overview**: Admins can monitor the list of active buyers, gaining insights into user engagement and participation on the platform.

💰 **Product Price Analysis**: Admins can monitor product prices and trends, helping them stay informed about pricing strategies and market competitiveness.

📦 **Out-of-Stock Product Monitoring**: Admins can track products that are out of stock, enabling them to identify potential inventory issues and ensure timely restocking.

📊 **Stock Range Analysis**: Admins can view products by quantity in stock range, allowing them to assess stock levels and make informed decisions related to inventory management.

👥 View Products for a Seller: Admins can see the products listed by a particular seller, helping them monitor and manage seller-specific inventory and offerings.

With these 🔒🔍 features, admins can effectively track transactions, analyze data, ensuring smooth operations and facilitating decision-making on the Shopzilla platform.


# Buyer Role ⭐

🔒 **Login and Logout**: Buyers can securely log in and log out of their accounts.

🛒 **Purchase a Product**: Buyers can browse products and make purchases.

🔄 **Return a Purchase**: If the return policy is applicable, buyers can initiate a return within 30 days from the date of purchase.

💰 **Request a Refund**: Buyers can request a refund for the returned product.

🔄 **Restore Deleted Account**: Buyers can restore their deleted account within 30 days from the date of deletion.

🔄 **Update Account Details**: Buyers can update their personal information, such as contact details and shipping address.

❌ **Delete Account**: Buyers can choose to permanently delete their accounts.

💳 **Transaction History**: Buyers can view all their transactions.

🔍 **Filter Transactions**: Buyers can filter their transactions by ID, helping them quickly find specific purchases.

🗂️ **Sort Transactions**: Buyers can sort their transactions by GST percentage, date, final amount, or quantity.

💼 **Add Amount to Wallet**: Buyers can add funds to their wallet for future purchases.

With these features, buyers can conveniently log in and log out, make purchases, initiate returns within the applicable timeframe, request refunds, update their details, delete their accounts if desired, restore deleted accounts within a specific period, view their transaction history, filter and sort transactions, and add funds to their wallet for easy and secure transactions on the platform.

# Seller Role ⭐

🔒 **Login and Logout**: Sellers can securely log in to their accounts using their credentials and log out when they are done.

🔄 **Update Account Details**: Sellers can update their account information, such as name, contact details, and shipping address. This ensures accurate and up-to-date information for seamless communication with buyers.

❌ **Close Account**: Sellers have the option to close their accounts. However, as a part of our organization, before closing their account and withdrawing their income, sellers must first pay any pending amounts associated with refunds.

💰 **Pay Pending Amount**: If a buyer requests a refund for a returned product, the seller is responsible for paying the pending amount associated with the refund. Sellers must settle any pending amounts before closing their account and withdrawing their income.

🔄 **Reopen Account**: Sellers can request to reopen their closed accounts before the automatic reopening after 3 months. This allows them to continue selling on the platform without any interruption.

🔄 **Update Existing Product Details**: Sellers can modify the details of their existing products, such as title, description, pricing, and stock quantity. This enables sellers to keep their product information up-to-date and accurate.

➕ **Add Products**: Sellers can add new products to their inventory, including essential details like product name, description, pricing, stock quantity, and images. This expands their offerings and allows them to reach a wider customer base.

💸 **Withdraw Income**: Sellers can withdraw their income earned from product sales. When a buyer purchases a product from a particular seller, the payment made by the buyer is added to the seller's income. However, sellers must first settle any pending amounts before closing their account and withdrawing their income.

These features empower sellers to effectively manage their accounts, update product details, add new products, pay pending amounts, and seamlessly participate in the selling process on the Shopzilla platform while ensuring a fair and transparent refund process.

## Flow Chart

Explore the flow of operations within the system through our comprehensive flow charts:

<img alt="Demo" src="ReadmeImages/FlowChart.png" width="40%">

# Javadoc
For a deeper understanding of the project's implementation and to explore the functionality of the classes, we recommend referring to the Javadoc documentation. The Javadoc provides detailed explanations and documentation for each method, offering insights into how the code works and how to effectively utilize it. By reviewing the Javadoc, you can familiarize yourself with the available methods, their parameters, return types, and any specific requirements or considerations. It serves as a valuable resource for developers and users, enabling you to leverage the full potential of the project's codebase. 

**To access the Javadoc and delve into the implementation details, please visit the [Javadoc website](https://64939456a500070078df68b1--dulcet-torrone-dcf438.netlify.app/).**


## Database
The Shopzilla project utilizes a relational database to manage and store its data. The database schema is designed to handle various aspects of the e-commerce platform, including customer information, product details, orders, and more.

### Database Backup

A backup of the Shopzilla database is available in the [database_backup](/database_backup) directory of this repository. You can use this backup to restore the database to a specific point in time.

To restore the database backup, follow these steps:

1. Clone the repository to your local machine.
2. Locate the `database_backup` directory.
3. Use your preferred database management tool or command line interface to restore the backup file.

Note: Please ensure that you have the necessary database management system set up and configured before attempting to restore the database backup.

### Database Schema

The database schema for Shopzilla consists of the following tables:

<img alt="Demo" src="ReadmeImages/ER Diagram.png" />

## Useful SQL Queries

The [shopzilla_queries.sql](/queries) file in this repository contains several useful SQL queries that can be used with the Shopzilla database.

To use these queries, follow these steps:

1. Clone the repository to your local machine.
2. Locate the [shopzilla_queries.sql](/queries) file.
3. Use your preferred database management tool or command line interface to execute the SQL queries from the file.

Feel free to modify and use these queries based on your specific requirements.


## Graphical User Interfaces (GUI)

### Main GUI
The main GUI provides a user-friendly interface for accessing different functionalities of the Shopzilla Online Shopping Platform. Here's a snapshot of the main GUI:

![Main GUI](Pages/main.png)

### Admin Login Page
The admin login page allows administrators to securely log in to the system and access the admin functionalities. Here's a screenshot of the admin login page:

![Admin Login Page](Pages/admin.png)

### Seller Login Page
The seller login page enables sellers to log in to their accounts and manage their inventory and products. Here's a screenshot of the seller login page:

![Seller Login Page](Pages/seller.png)

### Buyer Login Page
The buyer login page allows buyers to log in to their accounts and browse products, make purchases, and track their transactions. Here's a screenshot of the buyer login page:

![Buyer Login Page](Pages/buyer.png)

Feel free to adjust the text or formatting to align with your project's style and content.

## Tools Used 🛠️
<table align="center">

<br>
    
  <tr>
     <td align="center" width="100">
        <img src="Tools/java.png" width="48" height="48" alt="javascript" />
      <br>Java 
    </td>
      <td align="center" width="100">
        <img src="Tools/mysql.png" width="45" height="45" alt="HTML" />
      <br>My SQL
    </td>
<td align="center" width="100">
        <img src="Tools/maven.png" width="48" height="48" alt="Vuejs" />
      <br>Maven
    </td>    
   <td align="center" width="100">
        <img src="Tools/jdbc.png" width="48" height="48" alt="CSS" />
      <br>JDBC
    </td>
   </tr>
   <tr>
<td align="center" width="100">
        <img src="Tools/swing.png" width="48" height="48" alt="Vuejs" />
      <br>Swing
    </td>    
<td align="center" width="100">
        <img src="Tools/lambok.png" width="48" height="48" alt="Vuejs" />
      <br>Lombok
    </td>    
<td align="center" width="100">
        <img src="Tools/eclipse.png" width="48" height="48" alt="Java" />
      <br>Eclipse
    </td>
<td align="center" width="100">
        <img src="Tools/github.png" width="48" height="48" alt="Vuejs" />
      <br>GitHub
    </td> 
  </tr> 

  </table>

<br>


## Project Presentation Video 🎥

To get a comprehensive overview of the Shopzilla Online Shopping Platform, I have prepared a detailed project presentation video. In this video, I walk you through the various features and functionalities of the platform, showcasing its seamless buying and selling experience.

**Watch the Project Presentation Video: [Video Presentation](https://drive.google.com/file/d/1tqy_GtrtqsgwKkOZUHJw2idoBV6HBAnW/view?usp=sharing)**

By watching the video, you'll gain insights into how Shopzilla connects registered buyers and sellers, simplifies product listing and inventory management, and ensures secure transactions. It's an excellent resource to understand the value and convenience the platform brings to online shopping.

I recommend watching the video to fully grasp the power and potential of Shopzilla. If you have any questions or would like to learn more, please don't hesitate to reach out to me.


## Contributing 💡

Thank you for considering contributing to the AuctoNet Auction System! We welcome your participation and value your input. To ensure a smooth and collaborative process, please follow the guidelines below:

1. **Clone the Repository**: Start by cloning this repository to your local machine using the following command:

   ```
   git clone https://github.com/Shubh2-0/Shopzilla-Online-Shopping-Platform.git
   ```

2. **Switch to the Desired Branch**: 📅🌱 The repository contains multiple branches representing different days of the week when development work was done previously. Choose the branch that corresponds to the day of the week. You can switch to a branch using the following command:

   ```
   git checkout branch-name
   ```

   Branches for each day of the week are as follows:
   - `main`
   - `day-1`
   - `day-2`
   - `day-3`
   - `day-4`
   - `day-5`

3. **Build and Test**: 🚀🔬 Before making any changes, build and test the existing codebase to ensure it is functioning correctly. Refer to the project's documentation for instructions on building and running the system.

4. **Create a New Branch**: 🌟🌿 If you want to enhance the code for better performance or add new features, feel free to create a new branch using a descriptive name that reflects the nature of your changes. For example:

   ```
   git checkout -b feature/new-feature
   ```

5. **Implement Your Changes**: 💻🔨 Make your desired changes to the codebase, following the project's coding conventions and best practices.

6. **Commit and Push**: ✅📝 Once you have completed your changes, commit your work with a clear and concise commit message. Then, push your branch to the remote repository:

   ```
   git commit -m "Add new feature: Feature description"
   git push origin feature/new-feature
   ```

7. **Create a Pull Request**: 🔄📬 Go to the GitHub repository and create a new pull request. Select the appropriate branches for comparison and provide a detailed description of your changes, along with any relevant information that would assist with the review process.

8. **Collaborate and Iterate**: 🤝💡 Engage in constructive discussions and address any feedback or suggestions from the community and maintainers. Iterate on your changes as necessary to meet the project's standards.

9. **Merge and Celebrate**: 🎉🔀 Once your pull request is approved and passes all necessary tests, it will be merged into the main branch. Congratulations on your successful contribution!

Thank you for your interest in improving the AuctoNet Auction System. Your contributions will make a significant impact on enhancing the overall user experience! Feel free to create a new branch and let's work together to create something amazing! ✨🚀




<h2>📬 Contact</h2>

If you want to contact me, you can reach me through below handles.


&nbsp;&nbsp;<a href="https://www.linkedin.com/in/shubham-bhati-787319213/"><img src="https://www.felberpr.com/wp-content/uploads/linkedin-logo.png" width="30"></img></a>

