## A spring boot application 
1. Learning to set up mongo
2. Learning to set up and use Cassandra
3. Learning to setup and use Postgres
4. Learning to setup and use Redis cache
5. Learning to setup and use Kafka
6. Learning to setup and use Elasticseach


I will be using Docker images to connect to each of these instances 

Will also be comparing using stop watch the latency for the same actions performed using each of these database systems
i.e. PUT/POST/GET operations and the time taken for each of these instances.
(will include time to connect, resolving hostnames, operation timeout etc)

.. Will also setup a reverse proxy and loadbalancer later during the development of the project.

### About the project
Spring boot based application to simulate online ticket booking application
Specifically booking for a particular live event. 
There will be no UI for the app. Booking of tickets will be done through APIs 😛

#### Assumptions:
1. One event is available.
2. Number of seats available in the event are as follows, with numbering and price mentioned: <br>
   a. Gold : 300 : G1, G2, G3, G4, ... G300 : Rs. 3,999/- each <br>
   b. Silver : 400 : S1, S2, S3, S4, ... S400 : Rs. 2,999/- each <br>
   c. Bronze : 600 : B1, B2, B3, B4, ... B600 : Rs. 1,999/- each <Br>
   d. General : 1000 : GL1, GL2, GL3, GL4, ... GL1000 : Rs. 999/- each <br>
   e. VIP : 100 : V1, V2, V3, V4, ... V100 : Rs. 9,999/- each <br>
   f. VVIP : 50 : VV1, VV2, VV3, VV4, ... VV50 : Rs. 12,999/- each <br>
3. Will simulate launch of event and APIs to trigger event booking through APIs. <br>
4. Number of total seats and seat map will be loaded onto a database <br>
   a. 300 + 400 + 600 + 1000 + 100 + 50 = 2450 seats in total <br>
   b. Create 6 tables, named after each of the seat types. i.e Gold, Silver, Bronze, General, VIP and VVIP <br>
   c. Columns would be: Seat number, bookingTime, userName, amountPaid, paymentGatewayUsed, status
5. One user can book a maximum of 4 tickets.

#### Goal:
1. Be able to provide easy and hassle free booking experience.
2. Should not overbook the seats.
3. Should be able to handle payment gateway (will use a simulation that will work like one) -- giving a standard timeout randomly <Br>
   i.e. for each transaction that occurs through the payment gateway, there will be random outcomes such as <br>
   a. success  : payment went through successfully, tickets booked <br>
   b. failure  : Payment will be retried once, tickets booked <br>
   c. failure  : No payment retry, tickets not booked <br>
   d. failure  : Timeout from payment gateway, retry with a different gateway, tickets booked <br>
   e. failure  : Timeout from one gateway, retry from different gateway also failed, tickets not booked. <br>
5. Users should be permitted to select seats of choice.
6. Output for each API call should show the following <br>
   a. Number of seats booked and seat numbers <br>
   b. Payment type and total amount <br>
   c. Time taken for entire request <br>
   ...
7. The types of payment gateways are:
   a. Paytm <br>
   b. Razorpay <br>
   c. CCAvenue <br>
   d. SBI <br>
  User will be allowed to retry with any of the random payment gateways. Since the payment gateway is a mock, this will be a random selection from within the code.


