CREATE table auto_post
(
    id   serial primary key,
    description text not null,
    created timestamp,
    auto_user_id int references auto_user(id)
);