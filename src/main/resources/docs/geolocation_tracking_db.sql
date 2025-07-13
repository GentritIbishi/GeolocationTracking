DROP TABLE IF EXISTS location_logs;
DROP TABLE IF EXISTS video_url;

CREATE TABLE location_logs (
  id SERIAL PRIMARY KEY,
  ip TEXT,
  permission TEXT,
  lat DOUBLE PRECISION,
  lon DOUBLE PRECISION,
  reason TEXT,
  timestamp TIMESTAMP
);

CREATE TABLE video_url (
    id SERIAL PRIMARY KEY,
    url TEXT NOT NULL
);

INSERT INTO video_url (id, url) VALUES (1, 'https://www.youtube.com/watch?v=dQw4w9WgXcQ');
