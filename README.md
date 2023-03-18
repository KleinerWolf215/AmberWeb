# AmberWeb
Homepage for a sports-club. Main features: Colaboration via calendar and making decision together.

## Calendar
Calendar having different views for past, present and future. 
* In the present view, members shall be able so see regular training times in a week view, which also shows possible other occasions scheduled. 
* These include meetings made by agreement between members, where one invites (naming a place and time) and others can agree to. 
* Maybe not everybody will be able to see such meetings, depending on privacy level of such a meeting and role of mentioned member.

## Degree of realization
* Model contains entities, but service-layer only got classes MemberService and RoleService so far. Tables and schema will be created when running. 
* Controller-level only got classes MemberController and RoleController so far.  
* Service Layer: No business-logic implemented, but some structural attempt made in direction of Choices, Agreements and Scheduler. There are no true SQL-queries places somewhere.
