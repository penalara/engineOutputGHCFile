# SessionAssigned Schema

```txt
engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items
```

Session, or on call hour, assigned in the timetable.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                     |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghcOutput.schema.json\*](../out/ghcOutput.schema.json "open original schema") |

## items Type

`object` ([SessionAssigned](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned.md))

# SessionAssigned Properties

| Property                        | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                          |
| :------------------------------ | --------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refSesion](#refsesion)         | `integer` | Required | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refsesion.md "engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items/properties/refSesion")         |
| [refClassRomms](#refclassromms) | `array`   | Optional | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refclassromms.md "engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items/properties/refClassRomms") |
| [refTeachers](#refteachers)     | `array`   | Optional | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refteachers.md "engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items/properties/refTeachers")     |

## refSesion

Identifier of the session in the input file.


`refSesion`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refsesion.md "engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items/properties/refSesion")

### refSesion Type

`integer`

## refClassRomms

List of classrooms assigned to teach the session.


`refClassRomms`

-   is optional
-   Type: `string[]` ([RefclassRomm](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refclassromms-refclassromm.md))
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refclassromms.md "engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items/properties/refClassRomms")

### refClassRomms Type

`string[]` ([RefclassRomm](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refclassromms-refclassromm.md))

## refTeachers

List of teachers assigned to the session.


`refTeachers`

-   is optional
-   Type: `string[]` ([RefTeacher](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refteachers-refteacher.md))
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refteachers.md "engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items/properties/refTeachers")

### refTeachers Type

`string[]` ([RefTeacher](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refteachers-refteacher.md))
