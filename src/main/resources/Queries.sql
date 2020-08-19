create TABLE items
(
  	item_id SERIAL PRIMARY KEY,
	item character varying(200),
	price numeric
);

create TABLE restaurants
(
  	restaurant_id SERIAL PRIMARY KEY,
	name character varying(200)
);

create TABLE addresses
(
  	address_id SERIAL PRIMARY KEY,
	address_line_1 character varying(200),
	address_line_2 character varying(200),
	city character varying(100),
	state character varying(100),
	pincode character varying(6)
);

create TABLE customers
(
  	customer_id SERIAL PRIMARY KEY,
	name character varying(200),
	phone character varying(200),
	email character varying(100),
	selected_present_location character varying(100)
);
