# AnonymousClassRoom Schema

```txt
engineOutputGHCSchema#/properties/timetable/properties/anonymousClassRooms/items
```

Object with anonymous classrooms created in a set of classrooms.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                     |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghcOutput.schema.json\*](../out/ghcOutput.schema.json "open original schema") |

## items Type

`object` ([AnonymousClassRoom](ghcoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom.md))

# AnonymousClassRoom Properties

| Property                                | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                     |
| :-------------------------------------- | -------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refClassRoomsSet](#refclassroomsset)   | `string` | Required | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom-properties-refclassroomsset.md "engineOutputGHCSchema#/properties/timetable/properties/anonymousClassRooms/items/properties/refClassRoomsSet")      |
| [classRoomsCreated](#classroomscreated) | `array`  | Required | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom-properties-listofanonymousrooms.md "engineOutputGHCSchema#/properties/timetable/properties/anonymousClassRooms/items/properties/classRoomsCreated") |

## refClassRoomsSet

Identifier name of the ClassRooms group.


`refClassRoomsSet`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom-properties-refclassroomsset.md "engineOutputGHCSchema#/properties/timetable/properties/anonymousClassRooms/items/properties/refClassRoomsSet")

### refClassRoomsSet Type

`string`

## classRoomsCreated

List of anonymous classroom created in one set of classrooms.


`classRoomsCreated`

-   is required
-   Type: `string[]` ([AnonymousRoom](ghcoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom-properties-listofanonymousrooms-anonymousroom.md))
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom-properties-listofanonymousrooms.md "engineOutputGHCSchema#/properties/timetable/properties/anonymousClassRooms/items/properties/classRoomsCreated")

### classRoomsCreated Type

`string[]` ([AnonymousRoom](ghcoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom-properties-listofanonymousrooms-anonymousroom.md))
