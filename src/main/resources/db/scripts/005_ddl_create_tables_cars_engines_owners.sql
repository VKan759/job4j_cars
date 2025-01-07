
CREATE table engine
(
    id   serial primary key,
    name text
);

CREATE table car
(
    id   serial primary key,
    name text,
    engine_id int references engine(id)
);


CREATE table owners
(
    id   serial primary key,
    name text,
    user_id int references auto_user(id)
);

CREATE table history_owners
(
    id   serial primary key,
    car_id int references car(id),
    owner_id int references owners(id)
);

CREATE table history
(
    id   serial primary key,
    startAt  timestamp,
    endAt timestamp
);