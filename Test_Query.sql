select n.id,n."name",a."name" parent_name from newtable n 
left join (select id,name from newtable n2)a on a.id = n.parent_id 
order by n.id
