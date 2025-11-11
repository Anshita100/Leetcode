# Write your MySQL query statement below
/*
Rule for a Triangle
For any 3 sides x, y, and z to form a valid triangle, the sum of any two sides must be greater than the third side.
That means:
x + y > z
y + z > x
z + x > y
If all three conditions are true, it’s a valid triangle ✅
Otherwise ❌, it’s not a triangle.
*/
SELECT 
  x,
  y,
  z,
  CASE 
    WHEN x + y > z AND y + z > x AND z + x > y 
    THEN 'Yes'
    ELSE 'No'
  END AS triangle
FROM Triangle;
