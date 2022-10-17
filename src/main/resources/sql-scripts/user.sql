CREATE TABLE IF NOT EXISTS shop_user
(
    user_id           bigserial PRIMARY KEY,
    user_created_by   varchar(32)        NOT NULL,
    user_created_when timestamp DEFAULT now(),
    user_updated_by   varchar(32),
    user_updated_when timestamp,
    user_deleted_by   varchar(32),
    user_deleted_at   timestamp(6),
    username          varchar(32) UNIQUE NOT NULL,
    user_email        varchar
        CHECK (
                user_email ~
                '^[a-zA-Z0-9.!#$%&''*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$'
            )
                                         NOT NULL UNIQUE
)