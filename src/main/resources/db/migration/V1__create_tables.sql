CREATE TABLE schedule_table(
  id BIGSERIAL PRIMARY KEY NOT NULL,
  start_time TIME NOT NULL,
  end_time TIME NOT NULL ,
  span INT NOT NULL
);