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
UPDATE video_url
SET url = 'https://www.tiktok.com/@edits.xlyr1cs/video/7526343943508856120?lang=en&q=don%20xhoni&t=1752420336565'
WHERE id = 1;
