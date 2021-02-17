# README

## Top-level Schemas

-   [EngineOutputGHCSchema](./ghcoutput.md "Schema document to format in Json the timetable created by PenalaraGHC") – `engineOutputGHCSchema`

## Other Schemas

### Objects

-   [AnonymousClassRoom](./ghcoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom.md "Object with anonymous classrooms created in a set of classrooms") – `engineOutputGHCSchema#/properties/timetable/properties/anonymousClassRooms/items`
-   [AssignedSection](./ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection.md "Section with one class units (or on call hours) assigned") – `engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items`
-   [GeneratedJsonTimetable](./ghcoutput-properties-generatedjsontimetable.md "Object with timetable specification resolved") – `engineOutputGHCSchema#/properties/timetable`
-   [SessionAssigned](./ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned.md "Class unit or on call hour assigned in the timetable") – `engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items`

### Arrays

-   [AssignedSections](./ghcoutput-properties-generatedjsontimetable-properties-assignedsections.md "List of sections assigned in the Timetable") – `engineOutputGHCSchema#/properties/timetable/properties/assignedSections`
-   [ListOfAnonymousRooms](./ghcoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom-properties-listofanonymousrooms.md "List of anonymous classroom created in one set of classrooms") – `engineOutputGHCSchema#/properties/timetable/properties/anonymousClassRooms/items/properties/classRoomsCreated`
-   [RefTeachers](./ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refteachers.md "List of teachers assigned to the class unit") – `engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items/properties/refTeachers`
-   [RefclassRomms](./ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refclassromms.md "List of classrooms assigned to teach the class unit") – `engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items/properties/refClassRomms`
-   [SessionsAssigned](./ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned.md "List of class units and on call hours assigned in the section") – `engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned`
-   [SetOfAnonymousClassRooms](./ghcoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms.md "Collection with anonymous classrooms created by the engine") – `engineOutputGHCSchema#/properties/timetable/properties/anonymousClassRooms`

## Version Note

The schemas linked above follow the JSON Schema Spec version: `https://json-schema.org/draft/2019-09/schema`
