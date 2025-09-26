https://github.com/Avumile7/cape.git

Web development

Avumile gxula ST10493948 HIGHER CERTIFICATE IN APP APPLICATION AND WEB DEVELOPMENT 



POE2

This is a website for studing online for poeple who are doing apps and websites etc.this website contain every ui and ux lessons to learn but it does not provide code only designing and prototyping 

                                                                                              LINKS
                                                                                              
NUMBER 1

link for Document proposl .https://1drv.ms/w/c/8482d9d4034daf79/EbKOje6hnlhFvw54zt-pBBoBv_9VJS53PZoVD4cUWQ35cw?e=V6cyqq

link for content research and sourcing .https://1drv.ms/w/c/8482d9d4034daf79/EVl-wiln7ndEh21tRZH1S0UB3bnDEfQEztli1NN6G7EywQ?e=Z7Icmt

link for sitemap .https://app.visily.ai/projects/ee35b162-a1bd-4b95-925f-fe1d1daf4a58/boards/2145309



                                                                                              COMMITED CHANGES  IN HTML FILES
																							  
																							  
																							  
                                                                                            CHANGES 
																							

																							
	I CHANGED THE WEBSITE FOLDER BUT THE CONTENT AND THE FUNCTIONALITY ARE STILL THE SAME 
	
                                                                                              
                                                                                              
                                                                                            
                                                                                              1. Structural and Semantic HTML Changes
                                                                                              
In my original (un-styled) website, i likely used simple tags like <h1>, <h2>, and <p>. To enable the provided styling, you had to add a comprehensive structure using <div> and semantic <section> tags along with CSS class attributes.


File	HTML Element Added	Purpose 


All Pages	<header>, <nav>, <ul>, <li>	Created the navigation bar structure and linked it to the header element for dark background styling.


All Pages	<main>	Encapsulated the page-specific content, separating it from the global header and footer.


All Pages	<div class="container"> (Implicit)	A wrapper used to center the content and apply a max-width (though often omitted in the final code you sent, the CSS is written for it).


All Pages	<section class="[section-name]">	Every major block of content (e.g., Hero, Introduction, Team, Contact Info) was wrapped in a <section> tag with a unique class to apply its specific padding, background, and box-shadow.


index.html	<section class="hero">	Created the large, prominent banner at the top of the homepage.


index.html	<a href="..." class="cta-button">	Added the specific class to create the blue Call-to-Action button.


index.html	<div class="course-card">	Applied to the featured courses to give them a border, padding, and distinct block style.


courses.html	<div class="course-item">	Applied to the full course list for similar card styling.


enquiry.html	<form action="#" method="post">	Implemented a structured form with <label>, <input>, <select>, and <textarea> tags, all styled by the CSS


                                                                                                 2. COMMITED CHANGES IN CSS 
																								 
                                                                                                 
                                                                                                 2. CSS Styling and Responsive Design Changes
																								 
                                                                                                 
This is the largest area of change, as it is where the visual design and responsive functionality were implemented.



a. Global Styling & Reset

Basic Reset (*): Added margin: 0; padding: 0; box-sizing: border-box; to ensure consistent starting points across all browsers.


Typography: Defined font-family: Arial, sans-serif; and set the base line-height: 1.6; and color: #333; on the body.


Box Shadow: Introduced box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1); to almost every content section (.introduction, .team, etc.) to give them a lifted, three-dimensional look.


Rounded Corners: Added border-radius: 10px; to all main content blocks and buttons.


b. Responsive Design Implementation


Relative Units (3.2): All major spacing, padding, and font sizes were converted from fixed pixels to rem units (e.g., max-width: 1100px became max-width: 68.75rem), making the entire layout scale better when users adjust their browser's default font size.


Flexbox Layout:


Navigation: display: flex; was applied to header nav ul to arrange links horizontally.


Course Listings: On desktop, the .course-listing and .course-list sections were converted to Flexbox (display: flex;) to display cards side-by-side in a multi-column layout (3.1).



Media Queries (3.1):

Added the primary breakpoint: @media (max-width: 768px) (and the corresponding min-width: 48rem). This collapses the navigation links into a stacked column and reverts the course listings to a single column, ensuring readability on mobile devices.


Responsive Images (3.3):

Added max-width: 100%; and height: auto; to images, and introduced the srcset and sizes attributes on the index.html image to serve different file sizes based on the screen width.


c. Specific Component Styling


Header/Footer: Applied a dark background (#333) and set up the distinct accent blue bottom border (#007bff) on the header.


                                                                                            CHANGES 

																							
	I CHANGED THE WEBSITE FOLDER BUT THE CONTENT AND THE FUNCTIONALITYARE STILL THE SAME 



                                                                                                    
                                                                                                      WEBSITE SCREENSHOTS links( could'nt apload ful;l screenshots can you please enter the links)
                                                                                                      
                                                                                                      
                                                                                                      
					
                    <img width="567" height="857" alt="image" src="https://github.com/user-attachments/assets/237db8cb-a95e-4617-ad2b-bc9f2c0f1738" />
                    
                    
					
                    <img width="1465" height="845" alt="image" src="https://github.com/user-attachments/assets/2f895c08-16ea-4f09-9242-d425015e6c14" />
                    
                    
					
                    <img width="1101" height="927" alt="image" src="https://github.com/user-attachments/assets/e4e77d1b-a3a3-48ca-b60b-f58450e58ed1" />
                    
                    
                    


                                                                                         
                                                                                            3. Referencing
                                                                                            
                                                                                                
	
    World Wide Web Consortium (W3C) (2025) Cascading Style Sheets Level 3/4. Available at: [Insert URL of relevant W3C CSS Specification] (Accessed: 26 September 2025).
    
	
    World Wide Web Consortium (W3C) (2018) CSS Flexible Box Layout Module Level 1. Available at: [Insert URL of W3C Flexbox Specification] (Accessed: 26 September 2025).
    
  
  World Wide Web Consortium (W3C) (2022) Media Queries Level 4. Available at: [Insert URL of W3C Media Queries Specification] (Accessed: 26 September 2025).
  
	
    Mozilla Developer Network (MDN) (2025) CSS Values and Units. Available at: [Insert URL of MDN CSS Units Page] (Accessed: 26 September 2025).
    
  
  World Wide Web Consortium (W3C) (2022) HTML Standard: Images. Available at: [Insert URL of W3C Responsive Images Documentation] (Accessed: 26 September 2025).    
  
