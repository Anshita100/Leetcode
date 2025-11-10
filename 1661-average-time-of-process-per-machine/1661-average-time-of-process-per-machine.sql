/*To solve this problem, 1st we need to join the same table, so we will have starting time and ending time in the same line:

select s.machine_id, s.timestamp, e.timestamp
from Activity s
join Activity e
on s.process_id=e.process_id
and s.machine_id=e.machine_id
and s.timestamp<e.timestamp;
               
               start         end
| machine_id | timestamp | timestamp |
| ---------- | --------- | --------- |
| 0          | 0.712     | 1.52      |
| 0          | 3.14      | 4.12      |
| 1          | 0.55      | 1.55      |
| 1          | 0.43      | 1.42      |
| 2          | 4.1       | 4.512     |
| 2          | 2.5       | 5         |
now we can calculate the difference between timestamps, group the values by machine_id and round average value of differences

select a1.machine_id
, ROUND(AVG(a2.timestamp - a1.timestamp),3) as processing_time
from Activity a1
join Activity a2
on a1.process_id=a2.process_id
and a1.machine_id=a2.machine_id
and a1.timestamp<a2.timestamp
group by a1.machine_id;

| machine_id | processing_time |
| ---------- | --------------- |
| 0          | 0.894           |
| 1          | 0.995           |
| 2          | 1.456           |

*/

# Write your MySQL query statement below
SELECT
    a.machine_id,
    ROUND(AVG(b.timestamp - a.timestamp), 3) AS processing_time
FROM
    Activity a
        JOIN Activity b
        ON a.machine_id = b.machine_id
        AND a.process_id = b.process_id
        AND a.activity_type = 'start'
        AND b.activity_type = 'end'
GROUP BY
    a.machine_id;
/*                                                                                     |
| ---- | -------------------------------------------------------------------------------------------------- |
| 1️⃣  | Self-join the Activity table — join each `start` row (`a`) with its corresponding `end` row (`b`). |
| 2️⃣  | For each pair, calculate time = `b.timestamp - a.timestamp`.                                       |
| 3️⃣  | Use `AVG()` to compute the mean process time per machine.                                          |
| 4️⃣  | Round the result to **3 decimal places** as required.                                              |
*/