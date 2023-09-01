SELECT produto_id as id, nome from produto;

SELECT produto_id as id, nome from produto order by nome ASC;

SELECT produto_id as id, nome from produto order by RAND();

SELECT produto_id as id, nome from produto order by RAND() LIMIT 3;