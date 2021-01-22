# SessionAsigned Schema

```txt
engineOutputGHCSchema#/properties/timetable/properties/assigendSections/items/properties/sessionsAsigned/items
```

Session, or on call hour, assigned in the timetable.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                     |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghcOutput.schema.json\*](../out/ghcOutput.schema.json "open original schema") |

## items Type

`object` ([SessionAsigned](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-sessionsasigned-sessionasigned.md))

# SessionAsigned Properties

| Property                        | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                       |
| :------------------------------ | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refSesion](#refsesion)         | `integer` | Required | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-sessionsasigned-sessionasigned-properties-refsesion.md "engineOutputGHCSchema#/properties/timetable/properties/assigendSections/items/properties/sessionsAsigned/items/properties/refSesion")         |
| [refClassRomms](#refclassromms) | `array`   | Optional | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-sessionsasigned-sessionasigned-properties-refclassromms.md "engineOutputGHCSchema#/properties/timetable/properties/assigendSections/items/properties/sessionsAsigned/items/properties/refClassRomms") |
| [refTeachers](#refteachers)     | `array`   | Optional | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-sessionsasigned-sessionasigned-properties-refteachers.md "engineOutputGHCSchema#/properties/timetable/properties/assigendSections/items/properties/sessionsAsigned/items/properties/refTeachers")     |

## refSesion

Identifier of the session in the input file.


`refSesion`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-sessionsasigned-sessionasigned-properties-refsesion.md "engineOutputGHCSchema#/properties/timetable/properties/assigendSections/items/properties/sessionsAsigned/items/properties/refSesion")

### refSesion Type

`integer`

## refClassRomms

List of classrooms assigned to teach the session.


`refClassRomms`

-   is optional
-   Type: `string[]` ([RefclassRomm](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-sessionsasigned-sessionasigned-properties-refclassromms-refclassromm.md))
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-sessionsasigned-sessionasigned-properties-refclassromms.md "engineOutputGHCSchema#/properties/timetable/properties/assigendSections/items/properties/sessionsAsigned/items/properties/refClassRomms")

### refClassRomms Type

`string[]` ([RefclassRomm](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-sessionsasigned-sessionasigned-properties-refclassromms-refclassromm.md))

## refTeachers

List of teachers assigned to the session.


`refTeachers`

-   is optional
-   Type: `string[]` ([RefTeacher](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-sessionsasigned-sessionasigned-properties-refteachers-refteacher.md))
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-sessionsasigned-sessionasigned-properties-refteachers.md "engineOutputGHCSchema#/properties/timetable/properties/assigendSections/items/properties/sessionsAsigned/items/properties/refTeachers")

### refTeachers Type

`string[]` ([RefTeacher](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-sessionsasigned-sessionasigned-properties-refteachers-refteacher.md))
