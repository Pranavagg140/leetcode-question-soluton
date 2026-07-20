# Write your MySQL query statement below
Select tweet_id  from Tweets where CHAR_LENGTH(content) > 15 ORDER BY tweet_id ; 