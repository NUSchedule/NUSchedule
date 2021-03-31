# NUSchedule

Proposal for NUSchedule
Introduction
At the start of every semester, the process of model selection can be frustrating, as one needs to choose and arrange modules of all possibilities without conflict. Though NUSMODS has provided a way for students to arrange their potential module combinations, they often have to do it manually and end up with sub-optimal and compromising schedules. Therefore, we are dedicated to designing and implementing a platform that solves this problem. 
Overview
NUSchedule is a website that aims to provide students with a convenient platform to select and schedule their modules for an upcoming semester. With NUSchedule, students will only need to select a set of modules that they are interested in and specify a few requirements, and our website will generate a list of unconflicted module combinations for the student to choose from. More details regarding the use cases can be found under “Proposed Use Case”. This enables students to enjoy hassle-free module selection and planning in their university life. 

The implementation of NUSchedule will be completed by July 2021 for testing among NUS students during AY21/22 S1 module planning. If the outcome of the project is successful, we would like to seek the opportunity to integrate NUSchedule into NUSMODS to provide more centralised module planning services for NUS students. The scope of this proposal is limited to the development from now to July. 

Development Team
He Songchi
National University of Singapore
Bachelor of Computer Science
Year 3
e0322951@u.nus.edu


Zhu Ruicong
National University of Singapore
Bachelor of Science(Applied Mathematics and second Major in Computer Science)
Year 3 
e0324850@u.nus.edu



Li Gangwei
National University of Singapore
Bachelor of Computer Science with Minor in Psychology
Year 2
g.li@u.nus.edu


Luo Kaichun
NUS High School Alumnus
Rice University
Year 2
BA in Computer Science and Mathematics
kcluo@rice.edu

Proposed Use Case
System: NUSchedule
Use case: Scheduling Lectures and Tutorials
Actor: NUS students (User)
Preconditions: All information of NUS modules is already stored in the NUSchedule database

Main Success Scenario (MSS):
User chooses a set of interested modules via NUSchedule UI.
User ticks a compulsory/optional box for each module.
User sets a preference value (from 1 to 10) for optional modules.
User inputs maximum total MCs intended.
NUSchedule provides an overview of different sets of unconflicted modules that maximise the total number of MCs and total preference value. These sets are sorted in decreasing total MCs first, then in decreasing total preference value. 
User selects one of the sets from the NUSchedule UI to check details.
NUSchedule displays fully scheduled unconflicted lecture and tutorial timeslots.
  Use case ends.

Possible Future Extensions to Functionality
Enable students to reserve time slots for personal needs, for example, reserve Monday 12-2pm for lunch.
Expand the set of preference settings provided to students, for example, students are able to indicate “no class at night” or “schedule as many tutorials on a single day as possible.”
Recommend possible rankings for tutorial balloting to maximise the chance of getting the desired tutorial slots. 
Technical Stack
After some research into NUSMODS and other resources, we have come to an agreement on the technical stack to be used for the implementation of NUSchedule. 

ReactJS (Frontend)
Spring Boot/Web (RESTful API) (Backend)
Hibernate (DataBase)
Development Timeline
The development timeline for NUSchedule website can be divided into the following phases:
Planning and Architecture Design (1 Week)
Implementation (6 Weeks)
Extensive Alpha Testing (2 Weeks)
Beta Testing (2 Weeks)

To highlight, we intend to conduct Beta testing near the end of July 2020 among NUS students when module scheduling starts to take place. 

Conclusion
Currently this project is still in the phase of planning and idea conception. We are also very open to receiving any advice or feedback from experienced programmers. Ultimately, we believe that the idea behind NUSchedule addresses some problems in module planning encountered by the general NUS community and we hope this project could eventually develop into something that improves the life of the NUS community.
