# README

## Top-level Schemas

*   [EngineOutputGHCSchema](./ghcengineoutput.md "Schema document to format in Json the timetable created by PenalaraGHC") – `-`

## Other Schemas

### Objects

*   [AnonymousClassRoom](./ghcengineoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom.md "Object with anonymous classrooms created in a set of classrooms") – `undefined#/properties/timetable/properties/anonymousClassRooms/items`

*   [AssignedSection](./ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection.md "Section with one class units (or on call hours) assigned") – `undefined#/properties/timetable/properties/assignedSections/items`

*   [GeneratedJsonTimetable](./ghcengineoutput-properties-generatedjsontimetable.md "Object with timetable specification resolved") – `undefined#/properties/timetable`

*   [SessionAssigned](./ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned.md "Class unit or on call hour assigned in the timetable") – `undefined#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items`

### Arrays

*   [AssignedSections](./ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections.md "List of sections assigned in the Timetable") – `undefined#/properties/timetable/properties/assignedSections`

*   [ListOfAnonymousRooms](./ghcengineoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom-properties-listofanonymousrooms.md "List of anonymous classroom created in one set of classrooms") – `undefined#/properties/timetable/properties/anonymousClassRooms/items/properties/classRoomsCreated`

*   [RefTeachers](./ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refteachers.md "List of teachers assigned to the class unit") – `undefined#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items/properties/refTeachers`

*   [RefclassRomms](./ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refclassromms.md "List of classrooms assigned to teach the class unit") – `undefined#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items/properties/refClassRomms`

*   [SessionsAssigned](./ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned.md "List of class units and on call hours assigned in the section") – `undefined#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned`

*   [SetOfAnonymousClassRooms](./ghcengineoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms.md "Collection with anonymous classrooms created by the engine") – `undefined#/properties/timetable/properties/anonymousClassRooms`

## Version Note

The schemas linked above follow the JSON Schema Spec version: `https://json-schema.org/draft/2019-09/schema`
