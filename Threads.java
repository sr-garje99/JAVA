// Threads vs Process 
// threads are inside Process
// process are at os level

// threads share memory and resources
// processes do not share resources 

// multi threading vs multitasking 
// shared resources multitasking refers to processes

// threads can be created by implementing Runnable interface or by extending Thread class or 
// using Runnable functional interface 

// init >> runnable >> wait >> destroy are 4 phases of thread lifecycle

// wait notify sleep synchronized monitor locks 
// two or more threads can access oneshared object one at time when it is locked 

// wait notify releases lock while sleep do not release lock

// produceer consumer problem 

//thread(parent) join wait till thread(child) fininshes 
//priorty 1 to 10 (min,max) default = 5 no gaurantee of priority
//daemon = async thread orphan thread, finishes when all user thread finishes
// ex. garbage collector

//Locks and semaphores 
// locks work on two or more object while synchronized work on single objecct
