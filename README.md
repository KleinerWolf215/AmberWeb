# AmberWeb
Backend of a homepage, e.g. for a sports-club. Main features: Colaboration via calendar and making decision together (voting).

## Technology
Spring Boot, Gradle, JDK/Hibernate, MariaDb

## Views
Homepage shall have individual views, differing by their publicity level. For example members shall be able to see more than ordinary visitors of this homepage. This shall affect especially main features mentioned: calender and making decisions.

## Layout of Homepage
Presumably all content of this homepage can be traversed by just scrolling down or sidewards. But this does not affect backend.

## Calendar
Calendar having different views for past, present and future. 
* In the present view, members shall be able so see regular training times in a week view, which also shows possible other occasions scheduled. 
* These possible other occations include meetings made by agreement between members, where one invites (naming a place and time) and others can agree to. 
* Maybe not everybody will be able to see such occations / meetings, depending on privacy level of such a occasion / meeting and role of mentioned member.

## Making Decicions
Different ways to make decicions might be offered:
* Something comparable like a scrum poker (giving a subject a weight)
* Choosing many of many (Yes/No), e.g. dates or solutions
* Choosing one of many (Yes/No), e.g. a date or solution
A history of decisions could be implemented - where each decision could have a expiriy date - individually for show time and for related database content. Decisions shall only be visible for members.

## Feedback & Diagnosis
No cookies shall be used. But logging might be allowed but not without agreement of the related user - more in the form of temporarily recording user actions (he starts and stops such a recording). A feedback formular shall be provided, where such a logging can be attached.

## Degree of Realization
* Model contains entities, but tables and schema will be created when running. 
* Controller-level only got classes MemberController and RoleController so far.  
* Service-layer only got classes MemberService and RoleService so far. No business-logic implemented, but some structural attempt made in direction of Choices, Agreements and Scheduler. There are no true SQL-queries places somewhere.
