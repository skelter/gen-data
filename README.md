gen-data
========

Data generators

Need to generate example data, and a lot of it.

Static Resources
-------------------

We want the code for generating the data but don't want 
to always carry the source data in memory.  That means we 
will be reaching out to some store for the source material 
such as CSV files, or even a database.  Which store to hit
will need to be configurable.  