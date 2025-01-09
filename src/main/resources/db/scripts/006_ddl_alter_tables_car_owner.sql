alter table car add column owner_id int references owner(id);

alter table owner add column car_id int references car(id);