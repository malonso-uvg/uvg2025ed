from neo4j import GraphDatabase

uri = "bolt://localhost:7687"
user = "javaapp"
password = "Test2025!"

driver = GraphDatabase.driver(uri, auth=(user, password))

def run_query(query):
    with driver.session() as session:
        result = session.run(query)
        records = list(result)
        return records
    
query = "MATCH (pelicula:Movie) RETURN pelicula.title AS title"
result = run_query(query)

print("**** PELICULAS ****")
for record in result:
    print(record["title"])

query = "MATCH (n:Person) RETURN n.name"
actors = run_query(query)

print("**** ACTORES ****")

for record in actors:
    print(record["n.name"])